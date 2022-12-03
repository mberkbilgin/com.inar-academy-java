package chapters.chapter13.exercises.exercise13_11;

public class Octagon extends GeometricObject implements Cloneable, Comparable {
    private double side;

    public Octagon() {
    this(1);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public boolean equals(Object object) {
        Octagon o = (Octagon) object;

        if(this.side == ((Octagon) object).side){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return max((GeometricObject) o);
    }
    public Object clone() throws CloneNotSupportedException {
        Octagon octagon = (Octagon) super.clone();
        return octagon;
    }

}
