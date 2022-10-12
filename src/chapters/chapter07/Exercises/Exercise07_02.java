package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers:");
        int[] arr = new int[10];
        fillArray(arr);
        System.out.println("Before the reverse:" + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After the reverse:" + Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void fillArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
}
