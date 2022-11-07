package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise526 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for n:");
        double n = input.nextDouble();
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            double a = 1;
            for (int j = 1; j <= i; j++) {
                a *= j;
            }
            sum += 1/a;
        }
        System.out.println("e is "+sum);
    }
}
