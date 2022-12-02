package chapters.chapter13.listings;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject object1 = new Circle(5);
        GeometricObject object2 = new Rectangle(5, 3);
        System.out.println("The two objects have the same area? " + equalArea(object1, object2));

        displayGeometricObject(object1);
        displayGeometricObject(object2);

    }

    private static void displayGeometricObject(GeometricObject object1) {
        System.out.println("---------------------------------");
        System.out.println("The areas is " + object1.getArea());
        System.out.println("The perimeter is " + object1.getPerimeter());

    }

    private static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }
}
