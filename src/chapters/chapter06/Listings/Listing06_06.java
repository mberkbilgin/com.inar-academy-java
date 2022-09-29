package chapters.chapter06.Listings;

import java.util.Scanner;

public class Listing06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int num1 = input.nextInt();
        System.out.println("Enter second integer:");
        int num2 = input.nextInt();
        System.out.print(num1+" and "+num2+"'s GCD is ");
        GCD(num1,num2);

    }
    public static void GCD(int num1, int num2){
        int gcd = 1;
        for (int i = 2; i <= ((num1 < num2) ? num1 : num2); i++) {
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
