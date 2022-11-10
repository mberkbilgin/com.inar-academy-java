package chapters.chapter10.exercises.exercise10_11;

public class TestCircle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("The area of circle is " + c1.getArea());
        System.out.println("The perimeter of circle is " + c1.getPerimeter());
        System.out.println("Is the point (3,3) inside the circle? " + c1.contains(3,3));
        System.out.println("Is the circle (4(x),5(y),10.5(r)) inside the circle? " + c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("Is the circle (3(x),5(y),2.3(r)) overlaps the circle? " + c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
