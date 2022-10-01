package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an investment amount:");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate / 1200;
        System.out.println("Enter number of years: ");
        double years = input.nextDouble();
        System.out.println("Years     Future Value");
        for (int i = 1; i <= years; i++) {
            System.out.printf("%-4d",i);
            System.out.printf("%18.2f\n", futureInvestmentValue(amount, monthlyRate, i));
        }

    }
    public static double futureInvestmentValue(double amount, double monthlyRate, double years){
        double futureValue = amount *  Math.pow(1 + monthlyRate, years * 12);
        return futureValue;
    }
}
