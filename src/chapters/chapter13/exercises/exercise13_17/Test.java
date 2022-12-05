package chapters.chapter13.exercises.exercise13_17;

public class Test {
    public static void main(String[] args) {
        Complex complex1 = new Complex(3.5, 5.5);
        Complex complex2 = new Complex(-3.5, 1);
        System.out.println(complex1.add(complex2));
        System.out.println(complex1.divide(complex2));
        System.out.println(complex1.subtract(complex2));
        System.out.println(complex1.multiply(complex2));
        System.out.println(complex1.abs());
    }
}
