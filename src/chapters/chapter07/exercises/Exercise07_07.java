package chapters.chapter07.exercises;

public class Exercise07_07 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        fillTheArray(arr);
        count(arr);
    }

    public static void count(int[] arr) {
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i){
                    count++;
                }
            }
            System.out.println("Count of "+i+" is "+count);
        }
    }

    public static void fillTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
    }
}
