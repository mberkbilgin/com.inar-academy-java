package chapters.chapter09.listings;

public class Listing09_02_SimpleCircle {
    public static void main(String[] args) {
        Listing09_02_SimpleCircle circle1 = new Listing09_02_SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        Listing09_02_SimpleCircle circle2 = new Listing09_02_SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        Listing09_02_SimpleCircle circle3 = new Listing09_02_SimpleCircle(100);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

    double radius;

    Listing09_02_SimpleCircle() {
        radius = 1;
    }

    Listing09_02_SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void SetRadius(double newRadius) {
        radius = newRadius;
    }
}

