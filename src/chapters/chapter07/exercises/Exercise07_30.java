package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array:");
        int number = input.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the values:");
        fillTheArray(arr);

        if (isConsecutiveFour(arr)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }

    }


    public static boolean isConsecutiveFour(int[] arr) {
        int count = 0;
        int arr1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr1) {
                count++;
            } else {
                count = 1;
                arr1 = arr[i];

            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public static void fillTheArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
}
