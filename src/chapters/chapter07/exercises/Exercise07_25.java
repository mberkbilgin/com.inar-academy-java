package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0 ");
        System.out.println("Enter values for a, b, c");
        double[] eqn = new double[3];
        double[] roots = new double[2];
        fillEqn(eqn);
        if (solveQuadratic(eqn, roots) == -1) {
            System.out.println("The equation has no real roots");
        } else {
            System.out.println("Number of roots is " + solveQuadratic(eqn, roots));
            System.out.println("Root" + ((roots1(eqn) == roots2(eqn)) ? (" is ") + roots1(eqn) : ("s is ") + roots1(eqn) + " and " + roots2(eqn)));
        }


    }

    public static double roots2(double[] eqn) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double r2 = (-b - Math.pow(b * b - 4 * (a * c), 0.5)) / (2 * a);
        return r2;
    }

    public static double roots1(double[] eqn) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double r1 = (-b + Math.pow(b * b - 4 * (a * c), 0.5)) / (2 * a);
        return r1;


    }

    public static boolean determine(double[] eqn) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        if ((b * b) - (4 * (a * c)) < 0) {
            return false;
        } else
            return true;
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        roots[0] = roots1(eqn);
        roots[1] = roots2(eqn);
        if (!determine(eqn)) {
            return -1;
        } else if (roots[0] == roots[1]) {
            return 1;
        } else {
            return 2;
        }


    }

    public static void fillEqn(double[] eqn) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
    }
}
