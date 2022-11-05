package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        System.out.println("Enter ten numbers:");
        fillTheArray(arr);
        System.out.printf("The mean is %.2f", mean(arr));
        System.out.printf("\nThe The standard deviation is %.5f", deviation(arr));
    }

    public static double deviation(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - mean(x), 2);
        }
        return Math.sqrt(sum / 9);
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / 10;
    }

    public static void fillTheArray(double[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
    }
}
