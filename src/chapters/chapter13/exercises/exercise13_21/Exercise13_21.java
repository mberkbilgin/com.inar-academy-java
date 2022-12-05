package chapters.chapter13.exercises.exercise13_21;

import chapters.chapter13.listings.Rational;

import java.util.Scanner;

public class Exercise13_21 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a, b and c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // -2ha = b => h = - b/2a
        Rational h = new Rational(-b,2*a);
        // h^2 * a + k = c => k = c - h^2 * a => c - b^2 / 4a^2 * a => c - b^2 / 4a
        Rational k = new Rational(4 * a * c - b * b,4 * a);
        System.out.println("h is " + h + " and k is " + k);
    }
}
