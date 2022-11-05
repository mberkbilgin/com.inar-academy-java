package chapters.chapter09.exercises;

import java.util.Scanner;

public class Exercise09_11_LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    Exercise09_11_LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    boolean isSolve() {
        if (getA() * getD() - getB() * getC() != 0) {
            return true;
        } else
            return false;
    }

    public double getX() {
        return (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
    }

    public double getY() {
        return (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
    }

    public static void main(String[] args) {
        double[] arr = new double[6];
        System.out.println("Enter values for equation");
        arr = getFromUser(arr);
        Exercise09_11_LinearEquation equation = new Exercise09_11_LinearEquation(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
        display(equation);
    }

    public static void display(Exercise09_11_LinearEquation equation) {
        if (equation.isSolve()) {
            System.out.println("x is " + equation.getX());
            System.out.println("y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }

    public static double[] getFromUser(double[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        return arr;
    }
}
