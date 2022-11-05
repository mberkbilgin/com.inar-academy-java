package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        fillTheArray(arr);
        System.out.println("The index of smallest element is " + indexOfSmallestElement(arr));
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void fillTheArray(double[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
    }
}
