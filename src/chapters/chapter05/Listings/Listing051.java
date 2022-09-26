package chapters.chapter05.Listings;

import java.util.Scanner;

public class Listing051 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10) ;
        int number2 = (int)(Math.random()*10) ;
        int answer = number1 + number2 ;
        Scanner input = new Scanner(System.in);

        System.out.printf("What is %d + %d ?",number1,number2);
        int guess = input.nextInt();

        while(guess != answer){
            System.out.printf("Wrong answer. \nWhat is %d + %d ?",number1,number2);
             guess = input.nextInt();

        }
        System.out.println("You got it!");


    }
}
