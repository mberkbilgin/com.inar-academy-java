package chapters.chapter08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers for row and column:");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] arr = new double[row][column];
        fillTheArr(arr);
        System.out.println("The location of the largest element is " + Arrays.toString(locateLargest(arr)));

    }

    public static int[] locateLargest(double[][] arr) {
        int[] index = new int[2];
        double high = Integer.MIN_VALUE;
        int indexForRow = -1;
        int indexForColumn = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > high) {
                    high = arr[i][j];
                    indexForRow = i;
                    indexForColumn = j;
                }
            }
        }
        index[0] = indexForRow;
        index[1] = indexForColumn;
        return index;
    }

    public static void fillTheArr(double[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }

    }
}
