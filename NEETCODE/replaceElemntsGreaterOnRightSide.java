package NEETCODE;

import java.util.Arrays;

public class replaceElemntsGreaterOnRightSide {
    public static void main(String[] args) {
        int nums[]={17,18,5,4,6,1};
        System.out.println(Arrays.toString(brute_solution(nums)));
        System.out.println(Arrays.toString(optimal_solution(nums)));
    }


    static int [] brute_solution(int nums[]){
        // brute force approach here is to replace current element  with maximum value, by finding largest among remaining values in the array. this is done still the end of the array
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=largest(nums,i+1,n-1);
        }
        nums[n-1]=-1;
        return nums;

        // Time complexity=O(n2)
    }

    static int largest(int nums[], int start,int end){
        int max=0;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    static int[] optimal_solution(int nums[]){

        // optimal approach is to iterate from backward of the array and store the greatest element
        // trick to remember here is nums[0]=max(1:5), nums[1]=max(2:5), this can be written as nums[0]=max(nums[1],max(1))
        int n=nums.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            int newmax=Math.max(max,nums[i]);
            nums[i]=max;
            max=newmax;
        }
        return nums;

        //Time complexity:O(n)
    }
}
