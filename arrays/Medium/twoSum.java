package arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(two2(nums, 6)));
    }

    //using this o(n^2) and sc o(1)
    public static int[] two(int[] nums, int target) {

        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //using, hashing
    public static int[] two1(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{i, map.get(rem)};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1,  -1};
    }

    //using two pointer

    public static int[] two2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            if(nums[i] + nums[j] == target){
                return new int[]{map.get(nums[i]), map.get(nums[j])};
            }
            if(nums[i] + nums[j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}
