package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise541 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int count = 0;
        System.out.println("Enter numbers :");
        int number = -1;
        while(number != 0){
            number = input.nextInt();
            if (number > max){
                max = number;
                count = 0;
            }
            if (max == number){
                count++;
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The occurrence count of the largest number is "+count);
    }
}
