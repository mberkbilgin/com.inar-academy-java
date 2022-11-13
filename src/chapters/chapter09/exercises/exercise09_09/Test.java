package chapters.chapter09.exercises.exercise09_09;

public class Test {
    public static void main(String[] args) {
        Exercise09_09_RegularPolygon polygon1 = new Exercise09_09_RegularPolygon();
        Exercise09_09_RegularPolygon polygon2 = new Exercise09_09_RegularPolygon(6,4);
        Exercise09_09_RegularPolygon polygon3 = new Exercise09_09_RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon-1");
        System.out.println("Perimeter is " + polygon1.getPerimeter());
        System.out.printf("Area is %.3f", polygon1.getArea());
        System.out.println("\n-------------------------------");
        System.out.println("Polygon-2");
        System.out.println("Perimeter is " + polygon2.getPerimeter());
        System.out.printf("Area is %.3f", polygon2.getArea());
        System.out.println("\n-------------------------------");
        System.out.println("Polygon-3");
        System.out.println("Perimeter is " + polygon3.getPerimeter());
        System.out.printf("Area is %.3f", polygon3.getArea());
    }
}
