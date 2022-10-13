package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise07_08 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        System.out.println("Enter ten numbers:");
        fillTheArray(arr);
        System.out.println("The average of ten numbers is " + average(arr));
    }

    private static void fillTheArray(double[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
    }

    public static int average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / 10);
    }
    public static double average(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / 10);

    }

}
