package chapters.chapter05.Listings;

import java.util.Scanner;

public class Listing055 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        int answer = -1;
        while (answer != 0){
            System.out.println("Enter an integer (the input ends if it is 0):");
            answer = input.nextInt();
            sum += answer;
        }
        System.out.println("The sum is "+sum);
    }
}
