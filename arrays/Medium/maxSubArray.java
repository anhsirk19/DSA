package arrays.Medium;

public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr2(nums));
    }

    //TC IS O(N^2) SC IS O(1)
    public static int maxSubArr(int[] nums) {
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            for(int j = i ; j < nums.length ; j++){
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int maxSubArr2(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
