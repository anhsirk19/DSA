package arrays.Easy;

import java.util.Arrays;
//Rotate array by K elements
public class rotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        leftRotate(nums, k);
        System.out.print(Arrays.toString(nums));
    }
    public static void leftRotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rotate(nums, 0, n-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, n-1);
    }
    public static void rotate(int[] nums,int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
