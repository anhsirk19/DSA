package arrays.Easy;

import java.util.*;

public class longestSubarray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = longest(a, k);
        int len1 = longer(a, k);
        System.out.println(len1);
        System.out.println(len);
    }

    //this hashmap approach is used for array containing both positives and negatives
    //tc is o(n) and sc is o(n)
    static int longest(int[] nums, int k){
        int len = 0;
        long sum = 0;
        HashMap<Long, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];

            if(sum == k){
                len = Math.max(len, i+1);
            }

            long rem = sum-k;
            if(map.containsKey(rem)){
                len =  Math.max(i-map.get(rem), len);
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return len;
    }

    //using two pointers, it will only work for positives
    static int longer(int[] nums, int k){
        int len = 0;
        long sum = nums[0];
        int left = 0, right = 0;
        int n = nums.length;

        while(right < n){
            while(left <= right && sum > k){
                sum = sum - nums[left];
                left++;
            }
            
            if(sum == k){
                len = Math.max(len, right-left+1);
            }
            
            right++;
            if(right < n){
                sum += nums[right];
            }
        }
        return len;
    }
}
