package arrays.Easy;

//Max Consecutive Ones

public class maxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMax(nums));
    }
    public static int findMax(int[] nums) {
        int count = 0;
        int max_count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
                max_count = Math.max(count, max_count);
            }else{
                count = 0;
            }
        }
        return max_count;
    }
}
