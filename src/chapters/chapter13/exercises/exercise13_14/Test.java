package chapters.chapter13.exercises.exercise13_14;

public class Test {
    public static void main(String[] args) {
        Rational r = new Rational(5,2);
        Rational r1 = new Rational(9,5);
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r.add(r1));
        System.out.println(r.subtract(r1));
        System.out.println(r.multiply(r1));
        System.out.println(r.divide(r1));

    }
}
