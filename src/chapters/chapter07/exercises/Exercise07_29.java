package chapters.chapter07.exercises;

public class Exercise07_29 {
    public static void main(String[] args) {
        int[] arr = new int[52];
        fillTheArray(arr);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += pickFourCards(arr);
        }
        System.out.println("Sum of the four cards is " + sum);

    }

    public static int pickFourCards(int[] arr) {
        return arr[(int)(Math.random()*53)] % 13;

    }

    public static void fillTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }
    }
}
/**
 *1 14 27 40
 */