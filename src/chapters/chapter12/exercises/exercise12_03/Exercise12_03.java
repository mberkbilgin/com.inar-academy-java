package chapters.chapter12.exercises.exercise12_03;

import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = createWithRandom();
        try {
            System.out.println("Enter a number for the index of the array:");
            int number = input.nextInt();
            System.out.println("The corresponding value is " + arr[number]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }

    public static int[] createWithRandom() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
