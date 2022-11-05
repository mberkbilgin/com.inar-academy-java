package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities:");
        int number = input.nextInt();
        double[][] m = new double[number][2];
        fillCoordinates(m);
        centralOfCities(m);
        totalDistance(m);
    }

    public static void totalDistance(double[][] m) {
        double distance = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[m.length / 2] == m[i]) {
                continue;
            }
            distance += Math.sqrt(Math.pow((m[i][0] - m[m.length / 2][0]), 2) + Math.pow((m[i][1] - m[m.length / 2][1]), 2));

        }
        System.out.printf("The total distance to all other cities is %.3f", distance);
    }

    public static void centralOfCities(double[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][0] > m[j][0]) {
                    double temp = m[i][0];
                    m[i][0] = m[j][0];
                    m[j][0] = temp;
                    temp = m[i][1];
                    m[i][1] = m[j][1];
                    m[j][1] = temp;
                }
                if (m[i][0] == m[j][0]) {
                    double temp = m[i][0];
                    if (m[i][1] > m[j][1]) {
                        m[i][0] = m[j][0];
                        m[j][0] = temp;
                        temp = m[i][1];
                        m[i][1] = m[j][1];
                        m[j][1] = temp;
                    }
                }
            }
        }
        System.out.println("The central city is (" + m[m.length / 2][0] + ", " + m[m.length / 2][1] + ")");

    }

    public static void fillCoordinates(double[][] m) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the cities");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
    }
}
