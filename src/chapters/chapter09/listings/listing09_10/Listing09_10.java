package chapters.chapter09.listings.listing09_10;

import chapters.chapter09.listings.listing09_08.Listing09_08_CircleWithPrivateDataFields;

public class Listing09_10 {
    public static void main(String[] args) {
        Listing09_08_CircleWithPrivateDataFields myCircle = new Listing09_08_CircleWithPrivateDataFields(1);

        int n = 5;
        printAreas(myCircle, n);
    }

    public static void printAreas(Listing09_08_CircleWithPrivateDataFields myCircle, int n) {
        System.out.println("Radius \t\tArea");
        while (n >= 1){
            System.out.println(myCircle.getRadius() + "\t\t\t" + myCircle.getArea());
            myCircle.setRadius(myCircle.getRadius() + 1);
            n--;
        }
    }
}
