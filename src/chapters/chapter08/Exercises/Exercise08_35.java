package chapters.chapter08.Exercises;

import java.util.Scanner;

public class Exercise08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix:");
        int number = input.nextInt();
        int[][] matrix = new int[number][number];
        System.out.println("Enter the matrix row-by-row:");
        fillTheArr(matrix);
        int[] result = largestBlock(matrix);
        System.out.println("The maximum square submatrix is at (" + result[0] + ", " + result[1] + ") with size " + result[2]);

    }

    public static int[] largestBlock(int[][] matrix) {
        int[] result = new int[3];
        int max = 2;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                while(isSquare(row,col,max,matrix)){
                    result[0] = row;
                    result[1] = col;
                    result[2] = max;
                    max++;
                }
            }
        }
        return result;
    }

    public static boolean isSquare(int row, int col, int max, int[][] matrix) {
        if(row + max > matrix.length){
            return false;
        }
        if (col + max > matrix.length){
            return false;
        }
        for (int i = row; i < row + max; i++) {
            for (int j = col; j < col + max; j++) {
                if(matrix[i][j] != 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void fillTheArr(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
