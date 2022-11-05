package chapters.chapter08.exercises;


import java.util.Scanner;

public class Exercise08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] arr = new String[7][4];
        creatTheTicToc(arr);
        displayArr(arr);
        while (true) {
            playForX(arr);
            displayArr(arr);
            if (xWon(arr)) {
                System.out.println("Player X won!");
                break;
            }
            if (isDraw(arr)) {
                System.out.println("DRAW!");
                break;
            }
            playForO(arr);
            displayArr(arr);
            if (oWon(arr)) {
                System.out.println("Player O won!");
                break;
            }


        }
    }

    public static boolean isDraw(String[][] arr) {
        if (arr[1][0] != "|   " && arr[1][1] != "|   " && arr[1][2] != "|   " &&
                arr[3][0] != "|   " && arr[3][1] != "|   " && arr[3][2] != "|   " &&
                arr[5][0] != "|   " && arr[5][1] != "|   " && arr[5][2] != "|   ") {
            return true;
        } else {
            return false;
        }

    }

    public static boolean oWon(String[][] arr) {
        if (arr[1][0] == "| O " && arr[1][1] == "| O " && arr[1][2] == "| O "
                || arr[3][0] == "| O " && arr[3][1] == "| O " && arr[3][2] == "| O "
                || arr[5][0] == "| O " && arr[5][1] == "| O " && arr[5][2] == "| O "
                || arr[1][0] == "| O " && arr[3][0] == "| O " && arr[5][0] == "| O "
                || arr[1][1] == "| O " && arr[3][1] == "| O " && arr[5][1] == "| O "
                || arr[1][2] == "| O " && arr[3][2] == "| O " && arr[5][2] == "| O "
                || arr[1][0] == "| O " && arr[3][1] == "| O " && arr[5][2] == "| O "
                || arr[1][2] == "| O " && arr[3][1] == "| O " && arr[5][0] == "| O ") {
            return true;

        } else {
            return false;
        }
    }

    public static boolean xWon(String[][] arr) {
        if (arr[1][0] == "| X " && arr[1][1] == "| X " && arr[1][2] == "| X "
                || arr[3][0] == "| X " && arr[3][1] == "| X " && arr[3][2] == "| X "
                || arr[5][0] == "| X " && arr[5][1] == "| X " && arr[5][2] == "| X "
                || arr[1][0] == "| X " && arr[3][0] == "| X " && arr[5][0] == "| X "
                || arr[1][1] == "| X " && arr[3][1] == "| X " && arr[5][1] == "| X "
                || arr[1][2] == "| X " && arr[3][2] == "| X " && arr[5][2] == "| X "
                || arr[1][0] == "| X " && arr[3][1] == "| X " && arr[5][2] == "| X "
                || arr[1][2] == "| X " && arr[3][1] == "| X " && arr[5][0] == "| X ") {
            return true;

        } else {
            return false;
        }
    }

    public static void displayArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void playForX(String[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player X: ");
        int row = input.nextInt();
        System.out.println("Enter a column (0, 1, or 2) for player X: ");
        int column = input.nextInt();
        if (arr[(row * 2) + 1][column] == "|   ") {
            arr[(row * 2) + 1][column] = "| X ";
        } else {
            do {
                System.out.println("This part is not empty! Try again:");
                row = input.nextInt();
                column = input.nextInt();
            } while (!(arr[(row * 2) + 1][column] == "|   "));
            arr[(row * 2) + 1][column] = "| X ";
        }
    }

    public static void playForO(String[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player O: ");
        int row = input.nextInt();
        System.out.println("Enter a column (0, 1, or 2) for player O: ");
        int column = input.nextInt();
        if (arr[(row * 2) + 1][column] == "|   ") {
            arr[(row * 2) + 1][column] = "| O ";
        } else {
            do {
                System.out.println("This part is not empty! Try again:");
                row = input.nextInt();
                column = input.nextInt();
            } while (!(arr[(row * 2) + 1][column] == "|   "));
            arr[(row * 2) + 1][column] = "| O ";
        }
    }

    public static void creatTheTicToc(String[][] arr) {
        arr[0][0] = "----";
        arr[0][1] = "----";
        arr[0][2] = "----";
        arr[0][3] = "-";
        arr[1][0] = "|   ";
        arr[1][1] = "|   ";
        arr[1][2] = "|   ";
        arr[1][3] = "|";
        arr[2][0] = "----";
        arr[2][1] = "----";
        arr[2][2] = "----";
        arr[2][3] = "-";
        arr[3][0] = "|   ";
        arr[3][1] = "|   ";
        arr[3][2] = "|   ";
        arr[3][3] = "|";
        arr[4][0] = "----";
        arr[4][1] = "----";
        arr[4][2] = "----";
        arr[4][3] = "-";
        arr[5][0] = "|   ";
        arr[5][1] = "|   ";
        arr[5][2] = "|   ";
        arr[5][3] = "|";
        arr[6][0] = "----";
        arr[6][1] = "----";
        arr[6][2] = "----";
        arr[6][3] = "-";

    }
}
