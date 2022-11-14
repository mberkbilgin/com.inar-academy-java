package chapters.chapter11.listings;

public class PolymorphismDemo {
    public static void main(String[] args) {
     displayObject(new CircleFromSimpleGeometricObject("red",false,1));
     displayObject(new RectangleFromSimpleGeometricObject("black",false,1,1));
    }

    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
