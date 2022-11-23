package chapters.chapter12.listings;

import chapters.chapter12.listings.listing12_10.InvalidRadiusException;

public class Listing12_11 {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " +
                CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {
    private double radius;

    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0)
            this.radius = radius;
        else
            throw new InvalidRadiusException(newRadius);
    }


    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}