package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_28 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter ten numbers:");
        fillTheArray(arr);
        pickTwoNumbers(arr);
    }

    public static void pickTwoNumbers(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("[" + arr[i] + " " + arr[j] + "] ");
            }
            System.out.println();
        }
    }

    public static void fillTheArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
}
