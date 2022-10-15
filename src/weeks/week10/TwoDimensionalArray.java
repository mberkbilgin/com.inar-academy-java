package weeks.week10;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row for the array:");
        int row = input.nextInt();
        System.out.println("Enter the column for the array:");
        int column = input.nextInt();
        int[][] arr = new int[row][column];
        fill2DArrWithRandomValues(arr,0,100);
        printArr(arr);
    }


    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" [%3d ]", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void fill2DArrWithRandomValues(int[][]arr,int start, int limit){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(start +(Math.random() * (limit - start)));
            }
        }
    }
}
