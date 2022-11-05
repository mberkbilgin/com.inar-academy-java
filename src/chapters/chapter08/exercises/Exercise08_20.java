package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_20 {
    public static void main(String[] args) {
        int[][] board = new int[6][7];
        String[][] boardString = new String[6][7];
        display(board, boardString);
        while (true) {
            dropForRed(board);
            display(board, boardString);
            if (isRedWon(board)) {
                System.out.println("Congratulations!!!");
                System.out.println("The red player won");
                break;
            }
            if (isDraw(board)) {
                System.out.println("It is draw!");
                break;
            }
            dropForYellow(board);
            display(board, boardString);
            if (isYellowWon(board)) {
                System.out.println("Congratulations!!!");
                System.out.println("The yellow player won");
                break;
            }
        }
    }

    public static boolean isDraw(int[][] board) {
        for (int i = 0; i < 7; i++) {
            if (board[0][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isYellowWon(int[][] board) {
        if (sameRowForYellow(board) || sameColumnForYellow(board) || diagonalForYellow(board)) {
            return true;
        }
        return false;
    }

    public static boolean diagonalForYellow(int[][] board) {
        if (rightDiagonalForYellow(board) || leftDiagonalForYellow(board)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean rightDiagonalForYellow(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j <= 6; j++) {
                if (board[i][j] == 2) {
                    if (board[i + 1][j - 1] == 2) {
                        if (board[i + 1][j - 1] == 2) {
                            if (board[i + 1][j - 1] == 2) {
                                return true;
                            }
                        }
                    }
                }

            }

        }
        return false;
    }

    public static boolean leftDiagonalForYellow(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (board[i][j] == 2) {
                    if (board[i + 1][j + 1] == 2) {
                        if (board[i + 1][j + 1] == 2) {
                            if (board[i + 1][j + 1] == 2) {
                                return true;
                            }
                        }
                    }
                }

            }

        }
        return false;
    }

    public static boolean sameColumnForYellow(int[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 2) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean sameRowForYellow(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 2) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean isRedWon(int[][] board) {
        if (sameRowForRed(board) || sameColumnForRed(board) || diagonalForRed(board)) {
            return true;
        }
        return false;
    }

    public static boolean diagonalForRed(int[][] board) {
        if (rightDiagonalForRed(board) || leftDiagonalForRed(board)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leftDiagonalForRed(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (board[i][j] == 1) {
                    if (board[i + 1][j + 1] == 1) {
                        if (board[i + 1][j + 1] == 1) {
                            if (board[i + 1][j + 1] == 1) {
                                return true;
                            }
                        }
                    }
                }

            }

        }
        return false;
    }

    public static boolean rightDiagonalForRed(int[][] board) {
        /*row = 0 >>> column = 3>
         * row = 1 >>> column = 3>
         * row = 2 >>> column = 3>
         * */
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j <= 6; j++) {
                if (board[i][j] == 1) {
                    if (board[i + 1][j - 1] == 1) {
                        if (board[i + 1][j - 1] == 1) {
                            if (board[i + 1][j - 1] == 1) {
                                return true;
                            }
                        }
                    }
                }

            }

        }
        return false;
    }

    public static boolean sameColumnForRed(int[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 1) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean sameRowForRed(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }


    public static void dropForYellow(int[][] board) {
        Scanner input = new Scanner(System.in);
        System.out.println("Drop a yellow disk at column (0–6):");
        int number = input.nextInt();
        while (number < 0 && number > 6) {
            System.out.println("Invalid input! Try again");
            number = input.nextInt();
        }
        int row = 5;
        while (board[row][number] != 0) {
            row--;
        }
        board[row][number] = 2;

    }

    public static void dropForRed(int[][] board) {
        Scanner input = new Scanner(System.in);
        System.out.println("Drop a red disk at column (0–6):");
        int number = input.nextInt();
        while (number < 0 && number > 6) {
            System.out.println("Invalid input! Try again");
            number = input.nextInt();
        }

        int row = 5;
        while (board[row][number] != 0) {
            row--;
        }
        board[row][number] = 1;

    }

    public static void display(int[][] board, String[][] boardString) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    boardString[i][j] = "R";
                } else if (board[i][j] == 2) {
                    boardString[i][j] = "Y";
                } else {
                    boardString[i][j] = " ";
                }
                System.out.printf("%3s", "|" + boardString[i][j]);

            }
            System.out.print(" |");
            System.out.println();
        }
        System.out.println(" ______________________");
    }

}
