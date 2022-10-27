package chapters.chapter08.Exercises;

import java.util.Scanner;

public class Exercise08_27 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 array:");
        fillTheArr(m);
        m = sortColumns(m);
        display(m);
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] temp = new double[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                temp[i][j] = m[i][j];
            }
        }
        for (int i = 0; i < temp[0].length; i++) {
            double tempNumber = 0;
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j][i] > temp[j + 1][i]) {
                    tempNumber = temp[j][i];
                    temp[j][i] = temp[j + 1][i];
                    temp[j + 1][i] = tempNumber;
                }
            }
        }
        return temp;
    }

    public static void display(double[][] temp) {
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
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
