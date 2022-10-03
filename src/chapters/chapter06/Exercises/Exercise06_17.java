package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }
}
