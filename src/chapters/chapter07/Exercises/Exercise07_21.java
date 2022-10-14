package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls:");
        int numberOfBalls = input.nextInt();
        System.out.println("Enter the number of slots:");
        int numberOfSlots = input.nextInt();

        int[] slots = new int[numberOfSlots];
        String[] balls = new String[numberOfBalls];
        for (int i = 0; i < balls.length; i++) {
            beanMachine(slots, balls, i);
            System.out.println(balls[i]);
            numberOfRight(slots, balls, i);
        }
        displayBuildUp(slots, balls);
    }

    public static void displayBuildUp(int[] slots, String[] balls) {
        for (int i = balls.length; i > 0; i--) {
            for (int k = 0; k < slots.length; k++) {
                if (slots[k] >= i) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    public static void numberOfRight(int[] slots, String[] balls, int i) {
        String str = balls[i];
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'R') {
                count++;
            }
        }
        slots[count]++;

    }

    public static void beanMachine(int[] slots, String[] balls, int k) {
        String str = "";
        for (int i = 0; i < slots.length - 1; i++) {
            int random = (int) (Math.random() * 2);
            switch (random) {
                case 0:
                    str += "L";
                    break;
                case 1:
                    str += "R";
            }
        }
        balls[k] = str;
    }
}
