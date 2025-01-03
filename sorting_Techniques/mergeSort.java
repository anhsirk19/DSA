import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,6,3,4};
        System.out.println(Arrays.toString(sort(arr)));

        int[] arr2 = {10, 9, 8,7,6,5,4,3,2,1};
        inPlaceSort(arr2, 0, arr2.length-1);
        System.out.print(Arrays.toString(arr2));
    }
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            ans[k] = left[i];
            k++;
            i++;
        }

        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }

    static void inPlaceSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
    
        inPlaceSort(arr, low, mid);
        inPlaceSort(arr, mid + 1, high);
        inPlaceMerge(arr, low, mid, high);
    }
    
    static void inPlaceMerge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
    
        int i = low;
        int j = mid + 1;
        int k = 0;
    
        // Merge the two sorted halves into the temp array
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
    
        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
    
        // Copy remaining elements from the right half
        while (j <= high) {
            temp[k++] = arr[j++];
        }
    
        // Copy the merged result back to the original array
        for (int l = 0; l < temp.length; l++) {
            arr[low + l] = temp[l];
        }

    }
}
