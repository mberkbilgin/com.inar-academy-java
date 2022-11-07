package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise542 {
    public static void main(String[] args) {
        double salary = 5000;
        double sales = 0;
        double commission = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter commission that you want:");
        final int COMMISSION_SOUGHT = input.nextInt();
        double sum = 0;
        for (double partOfSales = 0; sum <= COMMISSION_SOUGHT; partOfSales +=0.1) {
            if (partOfSales > 10000) {
                commission = (5000 * 0.08) + (5000 * 0.10) + ((partOfSales - 10000) * 0.12);
                sum = 5000 + commission;
                sales = partOfSales;
            } else if (partOfSales > 5000 && partOfSales < 10000) {
                commission = (5000 * 0.08) + ((partOfSales - 5000) * 0.10);
                sum = 5000 + commission;
                sales = partOfSales;
            } else {
                commission = (5000 * 0.08) + (5000 * 0.10) + ((partOfSales - 10000) * 0.12);
                sum = 5000 + commission;
                sales = partOfSales;

            }
        }
        System.out.printf("If you wanted to earn $%d in a year in a year, your sales should be $%1.2f",COMMISSION_SOUGHT,sales);
    }
}
