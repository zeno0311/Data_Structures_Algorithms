package NEETCODE;

import java.util.Arrays;
import java.util.HashMap;
public class twosum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(brute_solution(nums, target)));
        System.out.println(Arrays.toString(optimal_solution(nums, target)));
    }

    static int[] brute_solution( int nums[],int target ){
        // brute force approach using two loops will try to add each elemnt of i with j if they are equal to target we will return their indices
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

        // time complexity:O(n2)

    }

    static int[] optimal_solution(int nums[],int target){
        // optimal approach is to use hashmap, check for the currenet element if remainder is present. if so return their indices

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainder=target-nums[i];
            if(map.containsKey(remainder)){
                return new int []{map.get(remainder),i};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int []{};

        //Time complexity:O(n)

    }
}
