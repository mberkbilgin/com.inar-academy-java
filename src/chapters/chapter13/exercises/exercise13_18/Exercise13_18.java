package chapters.chapter13.exercises.exercise13_18;

import chapters.chapter13.listings.Rational;

public class Exercise13_18 {
    public static void main(String[] args) {
        Rational sum = new Rational();
        for (long i = 1; i < 100; i++) {
            Rational num = new Rational(i, (i + 1L));
            sum = sum.add(num);
        }
        System.out.println("The sum is " + sum);
    }


}
