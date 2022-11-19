package chapters.chapter10.exercises.exercise10_08;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] b2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}};

        double[] r2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

        int[][] b2009 = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};


        double[] r2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        System.out.println("Enter your status:\n0=Single\n1=Married jointly-or qualifying widow(er)" +
                "\n2=Married separately\n3=Head of household");
        int status = input.nextInt();
        while (status >= 4 || status < 0){
            System.out.println("STATUS SHOULD BE BETWEEN 0 AND 3");
            status = input.nextInt();
        }
        System.out.println("Enter your taxable income:");
        double taxableIncome = input.nextDouble();

        Tax tax1 = new Tax(status,b2001,r2001,taxableIncome);
        Tax tax2 = new Tax(status,b2009,r2009,taxableIncome);
        System.out.printf("Tax that you must pay in the standart of 2001 is %.2f " , tax1.getTax());
        System.out.printf("\nTax that you must pay in the standart of 2009 is %.2f " , tax2.getTax());

    }
}
