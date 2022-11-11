package chapters.chapter10.exercises.exercise10_17;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        int count = 0;
            long sqrt = (long) Math.sqrt(Long.MAX_VALUE) + 1;
        BigInteger number = new BigInteger(sqrt + "");
        System.out.println("Long.MAX_VALUE is " + Long.MAX_VALUE);
        System.out.println("_______________________");
        while(count < 10){
            System.out.println(number.pow(2).toString());
            number = number.add(BigInteger.ONE);
            count++;
        }
    }
}
