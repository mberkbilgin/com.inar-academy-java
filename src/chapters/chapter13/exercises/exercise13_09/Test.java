package chapters.chapter13.exercises.exercise13_09;

public class Test {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(5);
        GeometricObject c2 = new Circle(8);
        System.out.println("Do these circles equal? " + c1.equals(c2));
    }
}
