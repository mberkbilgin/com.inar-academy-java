package chapters.chapter05.Exercises;

public class Exercise527 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 2100; i++) {
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
                count++;
                if (count % 10 == 0)
                    System.out.println(i);
                else
                    System.out.print(i+" ");
            }
        }
        System.out.println("\n\nNumber of leap year in this period is "+count);
    }
}
