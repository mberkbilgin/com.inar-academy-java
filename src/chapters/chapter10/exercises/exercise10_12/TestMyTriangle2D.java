package chapters.chapter10.exercises.exercise10_12;

import chapters.chapter10.exercises.exercise10_04.MyPoint;

public class TestMyTriangle2D {
    public static void main(String[] args) {
        MyTriangle2D triangle2D_1 = new MyTriangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Area is " + triangle2D_1.getArea());
        System.out.println("Perimeter is " + triangle2D_1.getPerimeter());
        System.out.println("Does it contain (3, 3) " + triangle2D_1.contains(new MyPoint(3, 3)));
        System.out.println("Does it contain triangle(2.9, 2), (4. 1), (1, 3.4) " + triangle2D_1.contains(new MyTriangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("Does it overLaps triangle(2, 5.5), (4. -3), (2, 6.5) " + triangle2D_1.overLaps(new MyTriangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));


        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,0);
        MyPoint p3 = new MyPoint(1.5,3);
        MyPoint p = new MyPoint(1.5,1.5);

        MyTriangle2D triangle2D_2 = new MyTriangle2D(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(1.5, 3));
        System.out.println(triangle2D_2.contains(new MyPoint(1.5, 1.5)));
        double area1 = new MyTriangle2D(p1,p,p2).getArea();
        double area2 = new MyTriangle2D(p2,p,p3).getArea();
        double area3 = new MyTriangle2D(p3,p,p1).getArea();
        double area4 = new MyTriangle2D(p1,p2,p3).getArea();
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println(area1 + area2 + area3);
        System.out.println(area4);

    }
}
