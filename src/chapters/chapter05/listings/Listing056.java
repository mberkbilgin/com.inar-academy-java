package chapters.chapter05.listings;

import java.util.Scanner;

public class Listing056 {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        int answer = -1;
        int sum = 0;
        do{
            System.out.println("Enter an integer (the input ends if it is 0)");
            answer = input.nextInt();
            sum += answer;
        }while(answer != 0);
        System.out.println("The sum is "+sum);
    }
}
