package chapters.chapter09.exercises.exercise09_11;

import java.util.Scanner;

public class Test {
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
