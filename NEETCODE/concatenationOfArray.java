package NEETCODE;

import java.util.Arrays;

public class concatenationOfArray {
    public static void main(String[] args) {
        int nums[]={1,3,2,1};
        System.out.println(Arrays.toString(brute_solution(nums)));
        System.out.println(Arrays.toString(optimal_solution(nums)));
        
    }
    static int[] brute_solution(int nums[]){

        // brute force approach here is create an new array of twice the size of num array, and use two loops to iterate through num and store in ans array
        int n=nums.length;
        int ans[]=new int[2*n];
        int idx=0;
        for(int i=0;i<n;i++){
            ans[idx]=nums[i];
            idx++;
        }

        for(int j=idx;j<2*n;j++){
            ans[idx]=nums[idx%n];
            idx++;
        }
        return ans;

        //Time Complexity: O(n2)
    }

    static int[] optimal_solution(int nums[]){

        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;

    }
}
