package STRIVERS;

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        System.out.println(Arrays.toString(better_solution1(nums)));
        System.out.println(Arrays.toString(better_solution2(nums)));
        System.out.println(Arrays.toString(optimal_solution(nums)));
    }

    static void brute_solution(int nums[]){
        // brute force approach is to use any one sorting method such as bubble sort

        // Time complexity:O(n2)
    }

    static int[] better_solution1(int nums[]){
        // brute force approach is to use Arrays.sort method
        Arrays.sort(nums);
        return nums;

        // time complexity:O(nlogn)
    }

    static int[] better_solution2(int nums[]){
        // better approach is to count the number of occurence of 0,1,2
        int count_0=0;
        int count_1=0;
        int count_2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count_0+=1;
            }else if(nums[i]==1){
                count_1+=1;
            }else{
                count_2+=1;
            }
        }

        for(int i=0;i<count_0;i++){
            nums[i]=0;
        }
        for(int i=count_0;i<count_0+count_1;i++){
            nums[i]=1;
        }
        for(int i=count_0+count_1;i<count_0+count_1+count_2;i++){
            nums[i]=2;
        }
        return nums;
        
        // time complexity=O(4n)

    }

    static int [] optimal_solution(int nums[]){

        // use dutch national flag algorithm

        // time complexity:O(n)

    }
}
