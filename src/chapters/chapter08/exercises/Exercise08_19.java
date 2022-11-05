package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row and column for array");
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] m = new int[row][column];
        fillTheArr(m);
        if (consecutiveFour(m)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

    public static boolean consecutiveFour(int[][] m) {
        if (sameRow(m)) {
            return true;
        }

        if (sameColumn(m)) {
            return true;
        }
        if (rightDiagonal(m)) {
            return true;
        }


        if (leftDiagonal(m)) {
            return true;

        }
        return false;


    }

    public static boolean leftDiagonal(int[][] m) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if(m[i][j] == m[i + 1][j + 1]){
                    if(m[i + 1][j + 1] == m[i + 2][j + 2]){
                        if(m[i + 2][j + 2] == m[i + 3][j + 3]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean rightDiagonal(int[][] m) {
        for (int i = m.length - 1; i >= 3; i--) {
            for (int j = 0; j <= 3; j++) {
                if(m[i][j] == m[i - 1][j + 1]){
                    if(m[i - 1][j + 1] == m[i - 2][j + 2]){
                        if(m[i - 2][j + 2] == m[i - 3][j + 3]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean sameRow(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int count = 1;
            for (int j = 0; j < m[i].length - 1; j++) {
                if (m[i][j] == m[i][j + 1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                }else{
                    count = 1;
                }
            }

        }
        return false;
    }

    public static boolean sameColumn(int[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            int count = 1;
            for (int j = 0; j < m.length - 1; j++) {
                if (m[j][i] == m[j + 1][i]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                }else{
                    count = 1;
                }
            }

        }
        return false;

    }

    public static void fillTheArr(int[][] m) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of arrays:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
    }
}
