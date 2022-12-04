package chapters.chapter13.exercises.exercise13_15;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational>{
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = BigInteger.valueOf(((denominator > 0) ? 1 : -1) * numerator / gcd);
        this.denominator = BigInteger.valueOf(Math.abs(denominator) / gcd);
    }

    private static long gcd(long numerator, long denominator) {
        long n1 = Math.abs(numerator);
        long n2 = Math.abs(denominator);
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator.longValue();
    }

    public long getDenominator() {
        return denominator.longValue();
    }

    public Rational add(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator() +
                denominator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator()
                - denominator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator();
        long d = denominator.longValue() * secondRational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.longValue() == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    public boolean equals(Object other) {
        if ((this.subtract((Rational) (other))).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.longValue() * 1.0 / denominator.longValue();
    }
}

