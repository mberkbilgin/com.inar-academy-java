package chapters.chapter09.listings.listing09_08;

public class Listing09_08_CircleWithPrivateDataFields {
    private double radius = 1;

    private static int numberOfObject = 0;

    public Listing09_08_CircleWithPrivateDataFields(){
        numberOfObject++;
    }
    public Listing09_08_CircleWithPrivateDataFields(double radius){
        this.radius = radius;
        numberOfObject++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = (radius >= 0) ? radius : 0;
    }
    public static int getNumberOfObject(){
        return numberOfObject;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }


}
