package arrays.Easy;
//Find Second Smallest and Second Largest Element in an array
public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {28078, 19451, 935, 28892, 2242, 3570, 5480, 231};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
