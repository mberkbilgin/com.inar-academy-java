package chapters.chapter09.exercises.exercise09_01;

public class Test {
    public static void main(String[] args) {
        Exercise09_01_Rectangle rectangle1 = new Exercise09_01_Rectangle(4,40);
        System.out.println("The area of rectangle of width " + rectangle1.width + " and height " + rectangle1.height + " is " + rectangle1.getArea());
        System.out.println("The perimeter of rectangle of width " + rectangle1.width + " and height " + rectangle1.height + " is " + rectangle1.getPerimeter() + "\n");

        Exercise09_01_Rectangle rectangle2 = new Exercise09_01_Rectangle(3.5,35.9);
        System.out.println("The area of rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getArea());
        System.out.println("The perimeter of rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getPerimeter() + "\n");
    }
}
