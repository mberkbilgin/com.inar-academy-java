package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        fillTheArr(m);
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
        }
    }

    public static void fillTheArr(double[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int j = 0; j < 3; j++) {
            sum += m[j][columnIndex];
        }
        return sum;

    }

}
