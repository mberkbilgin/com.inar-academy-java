package weeks.week09;

import weeks.week09.BinarySearch;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = new int[10];
        BinarySearch.fillArrWithRandomValues(arr,0,20);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    swap(arr, i ,j);
                }
            }
        }

    }
    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
