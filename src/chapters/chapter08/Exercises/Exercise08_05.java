package chapters.chapter08.Exercises;

import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        double[][] sumMatrix = new double[3][3];
        System.out.println("Enter numbers for matrix-1:");
        fillTheArr(matrix1);
        System.out.println("Enter numbers for matrix-2:");
        fillTheArr(matrix2);
        addMatrixs(matrix1, matrix2, sumMatrix);
        System.out.println("The matrices are added as follows:");
        displayArr(matrix1, matrix2, sumMatrix);

    }

    public static void displayArr(double[][] matrix1, double[][] matrix2, double[][] sumMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1[i].length; k++) {
                System.out.printf("%2.1f ", matrix1[i][k]);
                if (i == 1 && k == 2) {
                    System.out.printf("%2s ", " + ");
                } else {
                    System.out.printf("%3s ", " ");
                }

            }
            for (int k = 0; k < matrix2[i].length; k++) {
                System.out.printf("%2.1f ", matrix2[i][k]);
                if (i == 1 && k == 2) {
                    System.out.printf("%2s ", " = ");
                } else {
                    System.out.printf("%3s ", " ");
                }


            }
            for (int k = 0; k < sumMatrix[i].length; k++) {
                System.out.printf("%5.1f ", sumMatrix[i][k]);
            }
            System.out.println("");
        }
    }

    public static void addMatrixs(double[][] matrix1, double[][] matrix2, double[][] sumMatrix) {

        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
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

}

