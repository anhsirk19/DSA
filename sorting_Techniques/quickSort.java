import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 0 ,9 ,2, 3};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int pIndex = partition(nums, low, high);
        sort(nums, low, pIndex-1);
        sort(nums, pIndex+1, high);
    }

    static int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;
        while(i < j){
            while(nums[i] <= pivot && i < high){
                i++;
            }
            while(nums[j] > pivot && j > low){
                j--;
            }
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[j];
        nums[j] = nums[low];
        nums[low] = temp;
        return j;
    }
}
