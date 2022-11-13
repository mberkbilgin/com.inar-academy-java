package chapters.chapter11.listings;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
private double radius;

    public CircleFromSimpleGeometricObject() {
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + getRadius());
    }
}
