package chapters.chapter09.exercises;

import java.util.Arrays;

public class Exercise09_06_StopWatch {
    private long startTime;
    private long endTime;

    Exercise09_06_StopWatch() {
        startTime = System.currentTimeMillis();
    }

    long getStartTime() {
        return startTime;
    }

    long getEndTime() {
        return endTime;
    }

    void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    void setEndTime() {
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

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
