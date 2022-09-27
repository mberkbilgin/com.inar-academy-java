package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise523 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for n: ");
        double n = input.nextInt();
        double sum = 0;
        for (double i = 1; i <= n ; i++) {
            sum += 1/i ;
        }
        System.out.println("The sum for left to right is "+sum);

         sum = 0;
        for (double i = n; i >= 1; i--) {
            sum += 1/i;
        }
        System.out.println("The sum for right to left is "+sum);
    }
}
