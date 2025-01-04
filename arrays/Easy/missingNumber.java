package arrays.Easy;

//Find the missing number in an array

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missing(nums));
    }

    public static int missing(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            ans = ans^i+1;
            ans = ans^nums[i];
        }
        return ans;
    }
}
