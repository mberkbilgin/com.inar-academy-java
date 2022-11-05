package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter ten number to exclude from random (1-54): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The random number is " + getRandom(arr));

    }

    public static int getRandom(int... numbers) {
        int random = 0;
        boolean isTrueNumber = true;
        while (isTrueNumber) {
            random = (int) ((Math.random() * 53) + 1);
            for (int i = 0; i < numbers.length; i++) {
                if (random == numbers[i]) {
                    isTrueNumber = true;
                } else {
                    isTrueNumber = false;
                }
            }
        }
        return random;
    }
}