package arrays.Easy;

//Check if an Array is Sorted

public class checkSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int pivot = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] > nums[i+1]){
                pivot = i+1;
                break;
            }
        }
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[(pivot+i)%nums.length] > nums[(pivot+i+1)%nums.length]){
                return false;
            }
        }
        return true;
    }
}
