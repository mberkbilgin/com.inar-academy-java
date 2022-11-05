package chapters.chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers:");
        fillTheArray(numbers);
        System.out.println("Before the sort");
        System.out.println(Arrays.toString(numbers));
        sortTheArray(numbers);
        System.out.println("After the sort");
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortTheArray(double[] numbers) {
        for (int i = numbers.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[i] < numbers[j]) {
                    swap(numbers, i, j);
                }

            }
        }
    }

    public static void swap(double[] numbers, int i, int j) {
        double temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void fillTheArray(double[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }
}
