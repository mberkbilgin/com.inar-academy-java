package chapters.chapter10.exercises.exercise10_16;

import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger number = createBigInteger();
        while (count < 10) {
            if (number.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || number.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            } number = number.add(BigInteger.ONE);
        }

    }

    private static int sumOfDigit(StringBuilder sb) {
        int number = 0;
        for (int i = 0; i < sb.length(); i++) {
            number += sb.charAt(i);
        }
        return number;
    }

    private static BigInteger createBigInteger() {
        BigInteger number = new BigInteger("1");
        for (int i = 0; i < 49; i++) {
            number = number.multiply(BigInteger.valueOf(10));
        }
        return number;
    }
}
