package chapters.chapter06.Listings;

import java.util.Scanner;

public class Listing06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.print("The first " + number + " prime number are\n");
        primeNumber(number);
    }
    public static void primeNumber(int number) {
       int count = 0;
       int num = 2;
       while(count < number){
           boolean isPrime = true;
           for (int i = 2; i <= num / 2; i++) {
               if ((num % i == 0)){
                   isPrime = false;
                   break;
               }
           }
           if(isPrime){
               count++;
               if(count % 10 == 0)
                   System.out.printf("%-5s\n",num);
               else
                   System.out.printf("%-5s",num);

           }
           num++;
       }

    }
}
