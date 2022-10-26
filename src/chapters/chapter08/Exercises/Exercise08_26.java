package chapters.chapter08.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_26 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row-by-row:");
        fillTheArr(m);
        System.out.println("The row-sorted array is ");
        m = sortedRow(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] sortedRow(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 1; j++) {
                if (m[i][j] > m[i][j + 1]) {
                    double temp = m[i][j];
                    m[i][j] = m[i][j + 1];
                    m[i][j + 1] = temp;
                }
            }
        }
        return m;
    }


    public static void fillTheArr(double[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
    }
}
