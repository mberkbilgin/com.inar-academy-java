package chapters.chapter09.listings.listing09_09;

import chapters.chapter09.listings.listing09_08.Listing09_08_CircleWithPrivateDataFields;

public class Listing09_09 {
    public static void main(String[] args) {
        Listing09_08_CircleWithPrivateDataFields myCircle = new Listing09_08_CircleWithPrivateDataFields(5);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is " + Listing09_08_CircleWithPrivateDataFields.getNumberOfObject());


    }
}
