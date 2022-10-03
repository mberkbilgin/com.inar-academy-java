package chapters.chapter06.Exercises;

public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.println("i             m(i)");
        System.out.println("-------------------");
        for (int i = 2; i <= 21 ; i++) {
            System.out.printf("%-12d%.4f\n",(i-1),sumSeries(i));
        }
    }
    public static double sumSeries(int i){
        double sum = 0;
        for (double j = 1; j < i; j++) {
            sum += j / (j+1);
        }
        return sum;
    }
}
