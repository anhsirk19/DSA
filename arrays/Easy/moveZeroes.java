//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

package arrays.Easy;

import java.util.Arrays;

public class moveZeroes{
    public static void main(String[] args) {
        int[] nums = {2,1,0,3,12};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void move(int[] nums) {
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != 0){
                nums[i++] = nums[j];
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}