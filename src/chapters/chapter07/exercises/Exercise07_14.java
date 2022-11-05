package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_14 {
    public static void main(String[] args) {
        System.out.println("Ente five numbers:");
        int[] arr = new int[5];
        fillTheArray(arr);
        System.out.println("GCD of the numbers is " + gcd(arr));
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int gcd(int[] arr) {
        int gcd = 1;
        int div = 2;
        while (arr[0] != 1 && arr[1] != 1 && arr[2] != 1 && arr[3] != 1 && arr[4] != 1) {
            if (arr[0] % div == 0 && arr[1] % div == 0 && arr[2] % div == 0 && arr[3] % div == 0 && arr[4] % div == 0) {
                gcd *= div;
                newArr(arr, div);
            } else {
                div++;
            }
        }
        return gcd;
    }

    public static void newArr(int[] arr, int div) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= div;
        }
    }

    public static void fillTheArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
}
