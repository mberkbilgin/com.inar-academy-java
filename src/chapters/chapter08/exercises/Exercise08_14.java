package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size for the matrix:");
        int number = input.nextInt();
        int[][] arr = new int[number][number];
        fillTheArr(arr);
        if (sameRow(arr)) {
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = 1; j < arr[i].length; j++) {
                    if (arr[i][0] == arr[i][j]) {
                        count++;
                    } else {
                        count = 1;
                    }
                    if (count == arr[0].length) {
                        System.out.println("All " + arr[i][0] + "s on row " + i);
                    }
                }

            }

        } else {
            System.out.println("No same numbers on a row");
        }
        if (sameColumn(arr)) {
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = 1; j < arr[i].length; j++) {
                    if (arr[0][i] == arr[j][i]) {
                        count++;
                    } else {
                        count = 1;
                    }
                    if (count == arr.length) {
                        System.out.println("All " + arr[0][i] + "s on column " + i);
                    }
                }


            }

        } else {
            System.out.println("No same numbers on a column");
        }
        if (majorDiagonal(arr)) {
            System.out.println("All " + arr[0][0] + "s on major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
        if (subDiagonal(arr)) {
            System.out.println("All " + arr[arr[0].length - 1][arr[0].length - 1] + "s on sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }

    public static boolean subDiagonal(int[][] arr) {
        for (int i = arr[0].length - 2; i >= 0; i--) {
            if (arr[arr[0].length - 1][arr[0].length - 1] != arr[i][i]) {
                return false;
            }
        }
        return true;

    }

    public static boolean majorDiagonal(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[0][0] != arr[i][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean sameColumn(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[j][i] == arr[j + 1][i]) {
                    count++;
                }
                if (count == arr.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sameRow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    count++;
                }
                if (count == arr.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void fillTheArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
