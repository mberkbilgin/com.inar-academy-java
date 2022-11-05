package chapters.chapter09.exercises;

import java.util.Scanner;

public class Exercise09_13_Location {
    public int row;
    public int column;
    public double maxValue;

    Exercise09_13_Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Exercise09_13_Location locateLargest(double[][] a) {
        double max = Integer.MIN_VALUE;
        int x = -1;
        int y = -1;
        for (int j = 0; j < a.length; j++) {
            for (int l = 0; l < a[j].length; l++) {
                if (a[j][l] > max) {
                    max = a[j][l];
                    x = j;
                    y = l;
                }
            }
        }
        return new Exercise09_13_Location(x, y, max);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the rows and columns in the array");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] arr = new double[row][column];
        System.out.println("Enter the array");
        arr = getFromUser(arr);
        Exercise09_13_Location locate = locateLargest(arr);
        System.out.println("The location of the largest element is " + locate.maxValue + " at (" + locate.row + ", " + locate.column + ")");
    }

    public static double[][] getFromUser(double[][] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        return arr;
    }
}
