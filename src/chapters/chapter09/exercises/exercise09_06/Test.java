package chapters.chapter09.exercises.exercise09_06;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100_000];
        arr = fillTheArr(arr);

        Exercise09_06_StopWatch time = new Exercise09_06_StopWatch();
        time.setStartTime();
        Arrays.sort(arr);
        time.setEndTime();

        System.out.println("Sorting time is " + time.getElapsedTime() + " milliseconds");
    }

    public static int[] fillTheArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_000);
        }
        return arr;
    }
}
