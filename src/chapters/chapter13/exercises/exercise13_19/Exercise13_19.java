package chapters.chapter13.exercises.exercise13_19;

import chapters.chapter13.exercises.exercise13_15.Rational;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise13_19 {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        String number = innput.next();
        String[] decimal = number.split("[.]");
        Rational r1 = new Rational(new BigInteger(decimal[0]), BigInteger.ONE);
        Rational r2 = new Rational(new BigInteger(decimal[1]), new BigInteger(String.valueOf((int)Math.pow(10, decimal[1].length()))));

        System.out.println("The fraction number is " + (decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));
    }
}
