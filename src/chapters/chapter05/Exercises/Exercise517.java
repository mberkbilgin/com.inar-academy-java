package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int line = input.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = line-i-1; j > 0 ; j--) {
                System.out.print("    ");
            }
            for (int k = i+1; k >= 1 ; k--) {
                System.out.printf("%4d",k);
            }
            for (int l = 2; l <= i+1  ; l++) {
                System.out.printf("%4d",l);
            }
            System.out.println();


        }

    }
}
