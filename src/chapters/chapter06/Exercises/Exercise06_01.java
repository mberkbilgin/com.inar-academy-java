package chapters.chapter06.Exercises;

public class Exercise06_01 {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONAL_NUMBER = 100;
        for (int i = 1; i <= NUMBER_OF_PENTAGONAL_NUMBER ; i++) {
           if(i % 10 == 0){
               System.out.println();
           }
            System.out.printf("%-8s",getPentagonalNumber(i));
        }

    }
    public static int getPentagonalNumber(int i) {
        return  i * ( 3 * i - 1) / 2;
    }
}
