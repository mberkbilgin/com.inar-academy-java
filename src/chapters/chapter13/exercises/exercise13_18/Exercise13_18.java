package chapters.chapter13.exercises.exercise13_18;

import chapters.chapter13.exercises.exercise13_15.Rational;

import java.math.BigInteger;

public class Exercise13_18 {
    public static void main(String[] args) {
        Rational sum = new Rational();
        for (BigInteger i = BigInteger.ONE; i.compareTo(new BigInteger("100")) < 0; i = i.add(BigInteger.ONE)) {
            Rational num = new Rational(i, i.add(BigInteger.ONE));
            sum = sum.add(num);
        }
        System.out.println("The sum is " + sum);
    }


}
