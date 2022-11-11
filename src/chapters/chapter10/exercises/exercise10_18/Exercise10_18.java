package chapters.chapter10.exercises.exercise10_18;

import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        displayPrimeNumber();
    }

    public static void displayPrimeNumber() {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");

        int count = 0;
        while (count < 5) {
            if (number.isProbablePrime(1)) {
                System.out.println(number.toString());
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
