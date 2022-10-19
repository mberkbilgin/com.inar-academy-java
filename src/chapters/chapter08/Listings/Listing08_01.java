package chapters.chapter08.Listings;

import java.util.Scanner;

public class Listing08_01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        fillArr(arr);
        System.out.println("The sum of array is " + sum(arr));
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void fillArr(int[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for " + arr.length + " row and " + arr[0].length + " column");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = input.nextInt();
            }
        }
    }
}
