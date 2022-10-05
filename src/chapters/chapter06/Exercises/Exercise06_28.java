package chapters.chapter06.Exercises;

public class Exercise06_28 {
    public static void main(String[] args) {
        System.out.println("p                2^p-1");
        System.out.println("------------------------");
        for (int p = 2; p <= 31; p++) {
            if (isPrime(p) && isMersenneprime(p)){
                System.out.printf("%-17d%-1d\n",p,(int)(Math.pow(2,p) - 1));
            }
        }
    }

    private static boolean isMersenneprime(int p) {
        p = (int)(Math.pow(2,p) - 1);
        if (isPrime(p)){
            return true;
        }
        else
            return false;
    }

    public static boolean isPrime (int p){
        for (int i = 2; i < p; i++) {
            if (p % i == 0){
                return false;
            }
        }
        return true;
    }
}
