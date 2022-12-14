package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_30 {
    public static void main(String[] args) {
        double[][] a = new double[2][2];
        double[] b = new double[2];
        System.out.println("Enter a00, a01, a10, a11, b0, and b1");
        fillTheArr(a);
        fillTheArr(b);
        double[] root = new double[2];
        root = linearEquation(a,b);
        if(root == null){
            System.out.println("The equation has no solution.");
        }else{
            System.out.println("X is " + root[0] + " and Y is " + root[1]);
        }

    }
    public static double[] linearEquation(double[][] a, double[] b) {
        double[] arr = new double[2];
        if ((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0) {
            return null;
        }
            arr[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
            arr[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
            return arr;
        }

    public static void fillTheArr(double[][] a){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
    }

    public static void fillTheArr(double[] b) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }
    }
}
