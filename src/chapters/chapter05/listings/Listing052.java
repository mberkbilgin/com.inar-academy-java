package chapters.chapter05.listings;

import java.util.Scanner;

public class Listing052 {

    public static void main(String[] args) {

        int number = (int)(Math.random()*101);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess between 0 and 100");
        int guess = input.nextInt();

        while(guess != number){
            if(guess < number){
                System.out.println("Your guess too low. Try again.");
            }else
                System.out.println("Your guess too high. Try again.");
            guess = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
