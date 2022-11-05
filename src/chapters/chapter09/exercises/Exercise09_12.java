package chapters.chapter09.exercises;

import java.util.Scanner;


public class Exercise09_12 {
    public static void main(String[] args) {
        double[][] points = new double[4][2];
        System.out.println("Enter points for two lines");
        points = getFromUser(points);

        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        Exercise09_11_LinearEquation equation = new Exercise09_11_LinearEquation(a, b, c, d, e, f);

        display(equation);
    }

    public static void display(Exercise09_11_LinearEquation equation) {
        if (equation.isSolve()) {
            System.out.println("x is " + equation.getX());
            System.out.println("y is " + equation.getY());
        } else {
            System.out.println("The two lines are parallel");
        }
    }

    public static double[][] getFromUser(double[][] points) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
}
