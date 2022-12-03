package chapters.chapter13.exercises.exercise13_09;

public class Circle extends GeometricObject implements Comparable {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object object) {
        Circle circle = (Circle) object;
        if (this.radius == ((Circle) object).radius) {
            return true;
        }
        return false;
    }


    @Override
    public int compareTo(Object o) {
        return max((GeometricObject) o);
    }
}

