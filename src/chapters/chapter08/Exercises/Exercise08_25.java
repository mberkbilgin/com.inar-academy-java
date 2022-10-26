package chapters.chapter08.Exercises;

import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");
        fillTheArr(m);
        if (isMarkovMatrix(m)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        if (isPositive(m) && isSumOne(m)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSumOne(double[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][i];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPositive(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
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