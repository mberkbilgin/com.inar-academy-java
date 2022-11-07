package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise521 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();
        System.out.println("Enter number of years as an integer, e.g., 5: ");
        int numberOfYears = input.nextInt();
        double monthlyInterestRate, monthlyPayment, totalPayment;
        System.out.println("\nInterest Rate   Monthly Payment   Total Payment");
        for (double i = 5; i <= 8; i +=0.125) {
            monthlyInterestRate = i /1200;
            monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%.2f",i);
            System.out.print("%");
            System.out.printf("%18.2f%20.2f\n",monthlyPayment,totalPayment);
        }
    }
}
