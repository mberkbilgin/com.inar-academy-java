package chapters.chapter07.Listings;

import java.util.Arrays;

public class Listing07_08 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillTheArrays(arr);
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void fillTheArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
    }
}
