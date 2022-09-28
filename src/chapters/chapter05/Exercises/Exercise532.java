package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise532 {
    public static void main(String[] args) {
        int d1 = (int)(Math.random()*10);
        int d2 = (int)(Math.random()*10);
        while (d2 == d1){
            d2 = (int)(Math.random()*10);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess two digit number: ");
        int guess = input.nextInt();
        if(guess / 10 == d1 && guess % 10 == d2){
            System.out.println("Congratulations! You win $10.000");
        } else if (guess / 10 == d1 || guess % 10 == d2 || guess / 10 == d2 || guess % 10 == d1) {
            System.out.println("You win $3.000");
        }else
            System.out.println("Sorry! No Money.");

    }

}
