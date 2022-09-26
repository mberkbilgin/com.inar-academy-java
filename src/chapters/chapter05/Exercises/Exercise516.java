package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise516 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        int i = 2;
        System.out.print("Factors of "+number+" is ");
        while(number != 1) {
            if (number % i == 0) {
                number /= i;
                System.out.print(i+" ");
            }
            else
                i++;
        }
    }
}
