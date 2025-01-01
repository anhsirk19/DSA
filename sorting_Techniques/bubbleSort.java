import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int i=0 ; i < arr.length-1 ; i++){
            boolean swap = false;
            for(int j = 1;  j<arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    swap = true;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(swap == false){
                break;
            }
        }
    }
}