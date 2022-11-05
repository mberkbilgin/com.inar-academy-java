package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        System.out.println("Enter 10 numbers:");
        fillTheArray(arr);
        System.out.println("The minumum value for the array is " + min(arr));

    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void fillTheArray(double[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
    }
}
