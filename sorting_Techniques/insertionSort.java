import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
