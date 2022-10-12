package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100:");
        int[] arr = new int[100];
        int number = -1;
        while (number != 0) {
            number = input.nextInt();
            if (number > 0) {
                arr[number - 1]++;
            }
        }
        countOfNumber(arr);
    }

    public static void countOfNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((i + 1) + " occurs " + arr[i] + ((arr[i] > 1) ? " times" : " time"));
            }
        }


    }
}
