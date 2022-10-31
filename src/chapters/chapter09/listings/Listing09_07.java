package chapters.chapter09.listings;

public class Listing09_07 {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + Listing09_06_CircleWithStaticMembers.numberOfObjects);

        Listing09_06_CircleWithStaticMembers c1 = new Listing09_06_CircleWithStaticMembers();

        System.out.println("After creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");

        Listing09_06_CircleWithStaticMembers c2 = new Listing09_06_CircleWithStaticMembers(5);

        c1.radius = 9;

        System.out.println("After creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c1: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");

    }
}
