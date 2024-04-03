package NEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class duplicateNumbers {
    public static void main(String[] args) {
        int nums[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println(brute_solution(nums));
        System.out.println(better_solution(nums));
        System.out.println(optimal_solution1(nums));
        System.out.println(optimal_solution2(nums));
        
    }

    static boolean brute_solution(int nums[]){
        // brute force appproach is to use two loops compare i with all remaining elements. in any scenario if same returns true else false
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i=1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;

        //Time Complexity : O(n2)
    }

    static boolean better_solution(int nums[]){
        // better approach is sort the array, then compare the  present element to next element till the end of the array, if at any stage equal return true, else return false 
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        // Time complexity=O(log(n))+O(n)
    }

    static boolean optimal_solution1(int nums[]){
        //using hashset here try to check if the element is already present in the set, if present return true, else add element to set
        HashSet<Integer> set=new HashSet<>();
        for(int  x:set){
            if(set.contains(x)){
                return true;
            }else{
                set.add(x);
            }
        }
        return false;

        //Time complexity:O(n)
    }

    static boolean optimal_solution2(int nums[]){
        //Using Hashmap here we store each elemnts in map and count there occurences, in any case if count is greater than 1 return true else false.
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)&& map.get(x)>=1){
                return true;
            }else{
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        return false;
        // time complexity:O(n)
    }
}
