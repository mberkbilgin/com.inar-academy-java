package chapters.chapter05.Exercises;

public class Exercise524 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1, j = 3; i <= 97 && j <= 99; i +=2, j +=2) {
            sum += i/j;
        }
        System.out.println("The sum is "+sum);
    }
}
