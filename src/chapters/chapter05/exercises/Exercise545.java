package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise545 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        int count = 0;
        double mean = 0;
        double deviation = 0;
        while (count != 10){
            double number = input.nextDouble();
            count++;
            mean += number;
            deviation += Math.pow(number, 2);
        }
        deviation -= Math.pow(mean, 2) / 10;
        deviation = Math.sqrt(deviation / 9);
        System.out.printf("The mean is %1.2f",mean/10);
        System.out.printf("\nThe deviation is %1.6f",deviation);
    }

}
