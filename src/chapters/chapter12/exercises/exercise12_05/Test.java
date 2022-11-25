package chapters.chapter12.exercises.exercise12_05;

public class Test {
    public static void main(String[] args)  {
        try {
            Triangle t1 = new Triangle();
            System.out.println(t1);
            Triangle t2 = new Triangle(12,16,20);
            System.out.println(t2);
            Triangle t3 = new Triangle(3,4,9);
            System.out.println(t3);
        }catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }

    }
}
