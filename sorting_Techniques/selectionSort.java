import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        // code here
        for(int i = 0 ; i < arr.length-1 ; i++){
            //find max element in the array
            int max = 0;
            for(int j = 1 ; j  < arr.length - i ; j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    } 
}


