package chapters.chapter09.exercises.exercise09_06;

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


}
