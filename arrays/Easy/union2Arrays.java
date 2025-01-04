package arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//Union of 2 Sorted with Duplicates

public class union2Arrays {
    public static void main(String[] args) {

        int[] arr1 = { 2, 2, 3, 4, 5 };
        int[] arr2 = { 1, 1, 2, 3, 4 };

        System.out.println(findUnion(arr1, arr2));

    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : a){
            set.add(i);
        }

        for(int i : b){
            set.add(i);
        }

        for(int i : set){
            list.add(i);
        }

        Collections.sort(list);

        return list;
    }
}
