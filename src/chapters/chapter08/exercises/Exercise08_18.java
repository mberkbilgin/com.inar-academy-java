package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int number = input.nextInt();
        int[][] m = new int[number][2];
        System.out.println("Enter the numbers of array");
        fillTheArr(m);
        System.out.println("Before the shuffle");
        display(m);
        shuffle(m);
        System.out.println("After the shuffle");
        display(m);
    }
    public static void shuffle(int[][] m){
        int count = 0;
        while(count < 100){
            int number1 = (int)(Math.random()*m.length);
            int number2 = (int)(Math.random()*m.length);
            int temp = m[number1][0];
            m[number1][0] = m[number2][0];
            m[number2][0] = temp;
            temp = m[number1][1];
            m[number1][1] = m[number2][1];
            m[number2][1] = temp;

            count++;

        }
    }

    private static void display(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("{");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("} ");
        }
        System.out.println();
    }

    public static void fillTheArr(int[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
    }
}
