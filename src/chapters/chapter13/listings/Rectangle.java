package chapters.chapter13.listings;

public class Rectangle extends GeometricObject{
    private double weight;
    private double height;

    public Rectangle() {
        this(1.0,1.0);
    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double weight, double height) {
        super(color, filled);
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
