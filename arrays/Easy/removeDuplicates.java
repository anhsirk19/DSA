package arrays.Easy;

import java.util.Arrays;

//Remove Duplicates in-place from Sorted Array

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int remove(int[] nums) {
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        int k = i+1;
        while(i < nums.length-1){
            nums[++i] = 0;
        }
        return k;
    }
}
