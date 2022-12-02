package chapters.chapter13.exercises.exercise13_01;

import chapters.chapter13.listings.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThe area is " + getArea()
                + "\nThe perimeter is " + getPerimeter()
                + "\nThe color is " + getColor()
                + "\nIs it filled? " + isFilled();
    }
}