package chapters.chapter10.exercises.exercise10_06;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers prime = new StackOfIntegers();
        fillTheArr(prime);
        System.out.println("The prime number less than 120 is ");
        int count = 1;
        while (!prime.empty()) {
            if (count % 10 == 0) {
                System.out.println(prime.pop());
                count++;
            } else {
                System.out.print(prime.pop() + " ");
                count++;
            }
        }
    }

    public static void fillTheArr(StackOfIntegers prime) {
        int number = 120;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                prime.push(i);
            }
        }
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
