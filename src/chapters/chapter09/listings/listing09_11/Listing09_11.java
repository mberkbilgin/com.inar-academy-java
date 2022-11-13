package chapters.chapter09.listings.listing09_11;

import chapters.chapter09.listings.listing09_08.Listing09_08_CircleWithPrivateDataFields;

public class Listing09_11 {
    public static void main(String[] args) {

        Listing09_08_CircleWithPrivateDataFields[] circleArray;

        circleArray = createCircleArray();

        printCircleArray(circleArray);
    }

    public static void printCircleArray(Listing09_08_CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("—————————————————————————————————————————-");


        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
    }

    public static double sum(Listing09_08_CircleWithPrivateDataFields[] circleArray) {
        double sum = 0;


        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

        return sum;
    }

    public static Listing09_08_CircleWithPrivateDataFields[] createCircleArray() {
        Listing09_08_CircleWithPrivateDataFields[] circleArray = new Listing09_08_CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Listing09_08_CircleWithPrivateDataFields(Math.random() * 100);
        }
        return circleArray;
    }
}
