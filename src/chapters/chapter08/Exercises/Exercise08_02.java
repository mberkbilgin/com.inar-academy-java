package chapters.chapter08.Exercises;

import static chapters.chapter08.Exercises.Exercise08_01.fillTheArr;

public class Exercise08_02 {
    public static void main(String[] args) {
        double[][] m = new double[4][4];
        System.out.println("Enter 4-by-4 matrix rox-by-rox ");
        fillTheArr(m);
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
