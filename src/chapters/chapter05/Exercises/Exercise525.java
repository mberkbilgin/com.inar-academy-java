package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise525 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for n: ");
        double n = input.nextDouble();
        double pi = 0;
        for (double i = 1; i <= n; i++) {
            pi += 4*((Math.pow(-1,(i+1)))/(2*i-1));
        }
        System.out.println("π is "+pi);
    }
}
