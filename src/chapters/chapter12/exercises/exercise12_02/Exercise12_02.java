package chapters.chapter12.exercises.exercise12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args) {
        boolean x = true;
        while (x) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter two integers:");
            x = true;
            try {
               int n1 = input.nextInt();
                int n2 = input.nextInt();
                System.out.println("Sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
                x = false;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input!");
                System.out.println("Try again!");

            }

        }

    }
}
