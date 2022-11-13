package chapters.chapter09.exercises.exercise09_08;

public class Test {
    public static void main(String[] args) {
        Exercise09_08_Fan fan1 = new Exercise09_08_Fan(3, true, 10, "yellow");
        Exercise09_08_Fan fan2 = new Exercise09_08_Fan(2, false, 5, "blue");
        System.out.println("Fan-1");
        System.out.println(fan1.toString());
        System.out.println("-------------------------");
        System.out.println("Fan-2");
        System.out.println(fan2.toString());
    }
}
