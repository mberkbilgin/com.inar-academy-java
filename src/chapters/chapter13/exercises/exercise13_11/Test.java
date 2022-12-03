package chapters.chapter13.exercises.exercise13_11;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1 = new Octagon(5);
        System.out.println("The area is " + +o1.getArea());
        System.out.println("The perimeter is " + +o1.getPerimeter());
        Octagon o2 = new Octagon();
        o2 = (Octagon) o1.clone();
        System.out.println("Do these octagons equal " + o1.equals(o2));
    }
}
