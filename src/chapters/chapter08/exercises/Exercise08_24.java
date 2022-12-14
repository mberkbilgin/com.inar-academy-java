package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_24 {
    public static void main(String[] args) {
        int[][] grid = readSolution();

        System.out.println((isValid(grid)) ? "Valid Solution" : "Invalid Solution");
    }

    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (grid[i][j] <= 9 && grid[i][j] >= 1 && isValid(i, j, grid)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int i, int j, int[][] grid) {
        for (int column = 0; column < 9; column++) {
            if (column != j && grid[i][column] == grid[i][j]) {
                return false;
            }
        }
        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j]) {
                return false;
            }

        }
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                if (row != i && col != j && grid[row][col] == grid[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }


    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);
        int[][] grid = new int[9][9];
        System.out.println("Enter number for sudoku:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }
}
