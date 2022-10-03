package chapters.chapter06.Exercises;

public class Exercise06_14 {
    public static void main(String[] args) {
        System.out.println("i             m(i)");
        System.out.println("------------------");
        for (int i = 1; i <= 901 ; i += 100) {
            System.out.printf("%-12d%.4f\n",i,PI(i));
        }
    }
    public static double PI (int i){
        double pi = 0;
        for (int j = 1; j <= i; j++) {
            pi += Math.pow(-1,j+1) / (2 * j - 1);
        }
        return 4*pi;
    }
}
