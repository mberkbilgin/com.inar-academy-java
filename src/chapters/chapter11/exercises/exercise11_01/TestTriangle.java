package chapters.chapter11.exercises.exercise11_01;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("blue",false,3,4,5);
        System.out.println(t1.toString());
        System.out.println("The area is " +t1.getArea());
        System.out.println("The perimeter is " +t1.getPerimeter());
        System.out.println("The color is " +t1.getColor());
        System.out.println("Is filled ? " + t1.isFilled());
    }
}
