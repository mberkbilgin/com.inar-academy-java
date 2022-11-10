package chapters.chapter10.exercises.exercise10_13;

import chapters.chapter10.exercises.exercise10_11.Circle2D;

public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.printf("The area of rectangle is %.2f\n", r1.getArea());
        System.out.printf("The perimeter of rectangle is %.2f\n", r1.getPerimeter());
        System.out.println("Is the point (3,3) inside the rectangle? " + r1.contains(3,3));
        System.out.println("Is the circle (4(x),5(y),10.5(w),3.2(h)) inside the rectangle? " + r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println("Is the circle (3(x),5(y),2.3(w),5.4(h)) overlaps the rectangle? " + r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
    }
}
