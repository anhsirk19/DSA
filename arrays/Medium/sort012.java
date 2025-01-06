package arrays.Medium;

import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    //using arrays.sort() tc o(n) sc o(1)
    //using counting o 1 2 s tc is (2n) sc is o(1)


    //dutch national flag algorithm
    //tc is o(n) sc is o(1)
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, low, mid);
                low++;
                mid++;
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
