package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise530 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter amount of saving money: ");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate: ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate/1200;
        System.out.println("Enter number of month: ");
        double month = input.nextDouble();
        double savingMoney = 0;
        for (int i = 0; i < month; i++) {
            savingMoney =(int)((amount+savingMoney)*(1+monthlyRate)*100)/100.0;
        }
        System.out.println("in "+month +" month, saving amount is "+savingMoney);





    }
}
