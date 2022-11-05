package chapters.chapter07.checkpoints;

import java.util.Arrays;

public class Checkpoint07_13 {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] target = new int[source.length];
        for (int i = 0; i < source.length ; i++) {
            target[i] = source[i];
        }
        System.out.println(Arrays.toString(target));
    }
}
