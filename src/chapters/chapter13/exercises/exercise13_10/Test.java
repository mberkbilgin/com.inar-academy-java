package chapters.chapter13.exercises.exercise13_10;

public class Test {
    public static void main(String[] args) {
        GeometricObject r1 = new Rectangle(5,7);
        GeometricObject r2 = new Rectangle(7,5);
        GeometricObject r3 = new Rectangle(8,10);

        System.out.println("Do r1 and r2 equal? " + (r1.equals(r2)));
        System.out.println("Do r1 and r3 equal? " + (r1.equals(r3)));
        System.out.println("Do r2 and r3 equal? " + (r2.equals(r3)));
    }
}
