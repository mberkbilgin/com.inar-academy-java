package chapters.chapter09.listings.listing09_06;

public class Listing09_06_CircleWithStaticMembers {
    public double radius;

    public static int numberOfObjects = 0;

    public Listing09_06_CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    public Listing09_06_CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
}
