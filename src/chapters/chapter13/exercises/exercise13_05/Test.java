package chapters.chapter13.exercises.exercise13_05;

public class Test {
    public static void main(String[] args) {
        GeometricObject t1 = new Circle(3);
        GeometricObject t2 = new Circle(5);
        GeometricObject r1 = new Rectangle(5, 8);
        GeometricObject r2 = new Rectangle(2, 5);
        System.out.println("Is t1 bigger than t2? " + t1.max(t2));
        System.out.println("Is r1 bigger than r2? " + r1.max(r2));

    }
}
