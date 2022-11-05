package chapters.chapter07.checkpoints;

import java.util.Arrays;

public class Checkpoint07_24 {
    public static void main(String[] args) {
        double [] arr = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(double[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
