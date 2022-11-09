package chapters.chapter10.exercises.exercise10_05;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        StackOfIntegers integers = new StackOfIntegers();
        fillTheFactor(number, integers);
        while (!integers.empty()) {
            System.out.println(integers.pop());
        }

    }

    private static void fillTheFactor(int number, StackOfIntegers integers) {
        int divisor = 2;
        while (number != 1) {
            if (number % divisor == 0) {
                integers.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }
    }
}
