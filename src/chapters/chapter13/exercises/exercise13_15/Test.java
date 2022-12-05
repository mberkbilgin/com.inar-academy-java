package chapters.chapter13.exercises.exercise13_15;


import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        Rational r = new Rational(new BigInteger("5"),new BigInteger("2"));
        Rational r1 = new Rational(new BigInteger("9"),new BigInteger("5"));
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r.add(r1));
        System.out.println(r.subtract(r1));
        System.out.println(r.multiply(r1));
        System.out.println(r.divide(r1));
        System.out.println(r.intValue());
        System.out.println(r.doubleValue());
        System.out.println(r.longValue());

    }
}


