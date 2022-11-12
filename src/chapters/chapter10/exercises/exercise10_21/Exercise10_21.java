package chapters.chapter10.exercises.exercise10_21;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        display();

    }

    public static void display() {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        while (count < 10) {
            if (number.remainder(new BigInteger("5" )).intValue() == 0 || number.remainder(new BigInteger("6")).intValue() == 0) {
                System.out.println(number.toString());
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
