package arrays.Easy;
//Find the Largest element in an array
public class largestElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
