package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_23 {
    public static void main(String[] args) {
        int[][] m = new int[6][6];
        fillTheArr(m);
        display(m);
        flip(m);

    }

    public static void flip(int[][] m) {
        int r = -1;
        int c = -1;
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j] == 1){
                    count++;
                }
            }
            if(count != 0 && count != 2 && count != 4 && count != 6){
                r = i;
                break;
            }
        }
        for (int i = 0; i < m[0].length; i++) {
            int count = 0;
            for (int j = 0; j < m.length; j++) {
                if(m[j][i] == 1){
                    count++;
                }
            }
            if(count != 0 && count != 2 && count != 4 && count != 6){
                c = i;
                break;
            }
        }
        System.out.println("The flipped cell is (" + r + ", " + c + ")");
        }



    public static void display(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillTheArr(int[][] m) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fill the 6-by-6 array 0s and 1s ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int number = input.nextInt();
                while (number != 0 && number != 1) {
                    System.out.println("Please try again. Should enter only 0 or 1");
                    number = input.nextInt();
                }
                m[i][j] = number;

            }
        }
    }

}
