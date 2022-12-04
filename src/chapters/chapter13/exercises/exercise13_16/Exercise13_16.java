package chapters.chapter13.exercises.exercise13_16;


public class Exercise13_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage : java Exercise13_16 \"RationalNumber (+,-,/,*) RationalNumber\"");
        }
        String s = args[0];
        String[] str;
        str = s.split(" ");
        long n1 = Long.parseLong(str[0].charAt(0) + "");
        long d1 = Long.parseLong(str[0].charAt(2) + "");
        Rational r1 = new Rational(n1, d1);
        long n2 = Long.parseLong(str[2].charAt(0) + "");
        long d2 = Long.parseLong(str[2].charAt(2) + "");
        Rational r2 = new Rational(n2, d2);
        switch (str[1]) {
            case "+":
                System.out.println(str[0] + " + " + str[2] + " = " + r1.add(r2));
                break;
            case "-":
                System.out.println(str[0] + " - " + str[2] + " = " + r1.subtract(r2));
                break;
            case "/":
                System.out.println(str[0] + " / " + str[2] + " = " + r1.divide(r2));
                break;
            case "*":
                System.out.println(str[0] + " * " + str[2] + " = " + r1.multiply(r2));
        }

    }
}

class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
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
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
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
        return numerator * 1.0 / denominator;
    }
}
