package chapters.chapter09.exercises;

public class Exercise09_01_Rectangle {
    double width;
    double height;

    Exercise09_01_Rectangle() {
        width = 1;
        height = 1;
    }

    Exercise09_01_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Exercise09_01_Rectangle rectangle1 = new Exercise09_01_Rectangle(4,40);
        System.out.println("The area of rectangle of width " + rectangle1.width + " and height " + rectangle1.height + " is " + rectangle1.getArea());
        System.out.println("The perimeter of rectangle of width " + rectangle1.width + " and height " + rectangle1.height + " is " + rectangle1.getPerimeter() + "\n");

        Exercise09_01_Rectangle rectangle2 = new Exercise09_01_Rectangle(3.5,35.9);
        System.out.println("The area of rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getArea());
        System.out.println("The perimeter of rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getPerimeter() + "\n");
    }
}
