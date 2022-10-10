package chapters.chapter07.Checkpoints;

import java.util.Arrays;

public class Checkpoint07_10 {
    public static void main(String[] args) {
        double[] r = new double[100];
        for (int i = 0; i < r.length; i++) {
            r[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(r));
    }
}
