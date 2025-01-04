package arrays.Easy;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

public class singleNum {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans = ans ^ i;
        }
        return ans;
    }
}
