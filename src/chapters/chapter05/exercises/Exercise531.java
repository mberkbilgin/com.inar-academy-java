package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise531 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount:");
        double amount = input.nextDouble();
        System.out.println("Enter annual percentage yield:");
        double percentage = input.nextDouble();
        System.out.println("Enter maturity period (number of months):");
        double month = input.nextDouble();
        System.out.println("Month   CD Value   ");
        for (int i = 1; i <= month; i++) {
            amount = amount + amount * (percentage / 1200);
            System.out.printf("%2d",i);
            System.out.printf("%14.3f\n",amount);
        }


    }
}
