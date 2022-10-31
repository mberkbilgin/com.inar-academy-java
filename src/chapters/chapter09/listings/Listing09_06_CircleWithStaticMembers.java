package chapters.chapter09.listings;

public class Listing09_06_CircleWithStaticMembers {
    double radius;

    static int numberOfObjects = 0;

    Listing09_06_CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    Listing09_06_CircleWithStaticMembers(double newRadius){
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
