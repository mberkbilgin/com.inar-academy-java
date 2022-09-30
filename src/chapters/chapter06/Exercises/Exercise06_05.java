package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int i = input.nextInt();
        System.out.println("Enter the second integer:");
        int k = input.nextInt();
        System.out.println("Enter the third integer:");
        int j = input.nextInt();
        displaySortedNumbers(i, j, k);
    }

    public static void displaySortedNumbers(double a, double b, double c) {
        if (a > b && b > c) {
            System.out.println(a + " > " + b + " > " + c);
        } else if (a > c && c > b) {
            System.out.println(a + " > " + c + " > " + b);
        } else if (b > a && a > c) {
            System.out.println(b + " > " + a + " > " + c);
        } else if (b > c && c > a) {
            System.out.println(b + " > " + c + " > " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " > " + a + " > " + b);
        } else if (c > b && b > a) {
            System.out.println(c + " > " + b + " > " + a);
        }
    }
}