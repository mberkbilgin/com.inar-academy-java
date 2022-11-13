package chapters.chapter09.exercises.exercise09_13;

import java.util.Scanner;

import static chapters.chapter09.exercises.exercise09_13.Exercise09_13_Location.locateLargest;

public class Test {
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
