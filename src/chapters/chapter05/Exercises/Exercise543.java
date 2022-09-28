package chapters.chapter05.Exercises;

public class Exercise543 {
    public static void main(String[] args) {
       int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = i+1; j <=7 ; j += 1) {
                System.out.print(i);
                System.out.println(j);
                count++;
            }
        }
        System.out.println("All combinations is "+count);

    }
}
