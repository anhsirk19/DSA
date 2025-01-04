package arrays.Easy;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(searchInSorted(arr, 4));
    }

    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
}
