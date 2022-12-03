package chapters.chapter13.exercises.exercise13_07;

import chapters.chapter13.exercises.exercise13_06.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double s;

    public Square(double s) {
        this.s = s;
    }

    public Square() {
        this(1);
    }

    public Square(String color, boolean filled, double s) {
        super(color, filled);
        this.s = s;
    }

    @Override
    public double getArea() {
        return s * s;
    }

    @Override
    public double getPerimeter() {
        return 4 * s;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
