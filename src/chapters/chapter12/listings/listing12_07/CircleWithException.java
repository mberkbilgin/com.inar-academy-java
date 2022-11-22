package chapters.chapter12.listings.listing12_07;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public double findArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
