package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i = input.nextInt();
        displayPattern(i);

    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print("    ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.printf("%-4d",j);
            }
            System.out.println();
        }
    }
}
