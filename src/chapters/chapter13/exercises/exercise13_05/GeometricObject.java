package chapters.chapter13.exercises.exercise13_05;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public int max(GeometricObject object) {
        if (this.getArea() > object.getArea()) {
            return 1;
        } else if (this.getArea() < object.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea();


    public abstract double getPerimeter();
}

