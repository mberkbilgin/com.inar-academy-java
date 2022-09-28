package chapters.chapter05.Exercises;

public class Exercise535 {
    public static void main(String[] args) {
       double sum = 0;
        for (double i = 1; i < 625 ; i++) {
            sum += 1/(Math.sqrt(i)+Math.sqrt(i+1));
        }
        System.out.println("The sum is "+sum);
    }
}
