package arrays.Medium;

import java.util.HashMap;

public class majorElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement3(nums));
    }

    //using loops 
    //tc is o(n^2) and sc is o(1)
    public static int majorityElement(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count >= nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    //using hashmap
    //tc is o(n) and sc is o(n)

    public static int majorityElement2(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.containsKey(nums[i]) && map.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    //using boyers moore algorithm
    //tc is 
    public static int majorityElement3(int[] nums){
        int ele = nums[0];
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == ele){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                ele = nums[i];
                count = 1;
            }
        }
        return ele;
    }
}
