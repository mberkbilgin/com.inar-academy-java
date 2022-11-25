package chapters.chapter12.exercises.exercise12_10;

public class OutOfMemoryError {
    public static void main(String[] args) {
        try {
            Integer[] array = new Integer[100_000 * 10_000];
        } catch (java.lang.OutOfMemoryError ex) {
            System.out.println("OutOfMemoryError occurs");
        }
    }
}
