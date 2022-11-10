package chapters.chapter10.exercises.exercise10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public boolean contains(double x, double y) {
        if (Math.sqrt(Math.pow((getX() - x), 2) + Math.pow((getY() - y), 2)) <= getRadius()) {
            return true;
        } else
            return false;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow((getX() - circle.getX()), 2) + Math.pow((getY() - circle.getY()), 2));
        if (distance + circle.getRadius() <= getRadius()) {
            return true;
        } else
            return false;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow((getX() - circle.getX()), 2) + Math.pow((getY() - circle.getY()), 2));
        if (distance < getRadius() + circle.getRadius()) {
            return true;
        } else
            return false;
    }
}
