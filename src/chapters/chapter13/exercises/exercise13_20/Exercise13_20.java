package chapters.chapter13.exercises.exercise13_20;

import chapters.chapter13.exercises.exercise13_17.Complex;

import java.util.Scanner;

public class Exercise13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ax2 + bx + c = 0 ");
        System.out.println("Enter values for a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double disc = b * b - (4 * a * c);
        if (disc > 0) {
            double r1 = (-b + Math.pow(b * b - 4 * (a * c), 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(b * b - 4 * (a * c), 0.5)) / (2 * a);
            System.out.println("The roots of the equation are " + r1 + " " + r2);
        } else if (disc == 0) {
            double r1 = (-b + Math.pow(b * b - 4 * (a * c), 0.5)) / (2 * a);
            System.out.println("The root of the equation is " + r1);
        } else {
            Complex r1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
            Complex r2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
            System.out.println("The roots of the equation are " + r1 + " " + r2);
        }
    }
}
