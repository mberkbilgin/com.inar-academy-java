package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int number = input.nextInt();
        double[][] arr = new double[number][2];
        System.out.println("Enter " + number + " points:");
        fillTheArr(arr);
        int point1 = -1;
        int point2 = -1;
        double shortDistance = Integer.MAX_VALUE;
        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j < number; j++) {
                if (shortDistance > distance(arr, i, j)) {
                    shortDistance = distance(arr, i, j);
                }

            }
        }
        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j < number; j++) {
                if (distance(arr, i, j) == shortDistance) {
                    System.out.println("The closest two points is (" + arr[i][0] + ", " + arr[i][1] + ") and (" + arr[j][0] + ", " + arr[j][1] + ")");
                }
            }

        }
        System.out.println("The distance is " + shortDistance);


    }

    public static double distance(double[][] points, int i, int j) {
        double distance = Math.sqrt(Math.pow((points[i][0] - points[j][0]), 2) + Math.pow((points[i][1] - points[j][1]), 2));
        return distance;
    }

    public static void fillTheArr(double[][] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
    }

}
