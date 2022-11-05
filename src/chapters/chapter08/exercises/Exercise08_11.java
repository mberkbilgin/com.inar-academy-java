package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511");
        int number = input.nextInt();
        display(binary(number));
    }
    public static void display(int[][] binary) {
        for (int i = 0; i < binary.length; i++) {
            for (int j = 0; j < binary[i].length; j++) {
                if (binary[i][j] == 0) {
                    System.out.print("H ");
                } else {
                    System.out.print("T ");
                }
            }
            System.out.println();
        }
    }
    public static int[][] binary(int number) {
        int[][] arr = new int[3][3];
        String str = "";
        while (number != 0){
            str = (number % 2) +str;
            number /= 2;
        }
        for (int i = 9 - str.length(), j = 0; j < str.length(); i++,j++) {
           arr[i / 3][i % 3] = str.charAt(j) - '0';
        }
        return arr;
    }

}
