package chapters.chapter10.exercises.exercise10_12;

import chapters.chapter10.exercises.exercise10_04.MyPoint;

public class MyTriangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public MyTriangle2D() {
        this(0, 0, 1, 1, 2, 5);
    }

    public MyTriangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(new MyPoint(x1, y1), new MyPoint(x2, y2), new MyPoint(x3, y3));
    }


    public MyTriangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
    public double getArea() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        double s = (side1 + side2 + side3) / 3;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public double getPerimeter() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        return side1 + side2 + side3;

    }
    public boolean contains(MyPoint p) {
        return (getArea() == new MyTriangle2D(p1, p, p2).getArea() + new MyTriangle2D(p2, p, p3).getArea() + new MyTriangle2D(p1, p, p3).getArea());
    }

    public boolean contains(MyTriangle2D triangle2D) {
        return (contains(triangle2D.getP1()) && contains(triangle2D.getP2()) && contains(triangle2D.getP3()));
    }

    public boolean overLaps(MyTriangle2D triangle2D) {
        return (contains(triangle2D.getP1()) || contains(triangle2D.getP2()) || contains(triangle2D.getP3()));
    }

}
