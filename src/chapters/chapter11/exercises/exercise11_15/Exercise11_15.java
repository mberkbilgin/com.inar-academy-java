package chapters.chapter11.exercises.exercise11_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points:");
        int number = input.nextInt();
        ArrayList<Double> points = new ArrayList<>();
        fillTheArr(points, number * 2);
        System.out.println("The total area is " + area(points));

    }


    public static void fillTheArr(ArrayList<Double> points, int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the points: ");
        while (points.size() != number) {
            double temp = input.nextDouble();
            points.add(temp);
        }

    }

    public static double area(ArrayList<Double> points) {
        double a = 0;
        for (int i = 0; i < points.size() - 3; i += 2) {
            a += points.get(i) * points.get(i + 3);
        }
        double b = 0;
        for (int i = 1; i < points.size() - 1; i += 2) {
            b += points.get(i) * points.get(i + 1);
        }
        double area = 0.5 * (a - b);
        return Math.abs(area);
    }
}
