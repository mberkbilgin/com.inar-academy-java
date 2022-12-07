package chapters.extra.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class E07_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillRandomly(list);
        int[] counts = countOfNumber(list);
        display(counts);
    }

    private static void display(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println("The count of " + i + " is " + counts[i]);
        }
    }

    private static int[] countOfNumber(ArrayList<Integer> list) {
        int[] counts = new int[10];
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case 0:
                    counts[0]++;
                    break;
                case 1:
                    counts[1]++;
                    break;
                case 2:
                    counts[2]++;
                    break;
                case 3:
                    counts[3]++;
                    break;
                case 4:
                    counts[4]++;
                    break;
                case 5:
                    counts[5]++;
                    break;
                case 6:
                    counts[6]++;
                    break;
                case 7:
                    counts[7]++;
                    break;
                case 8:
                    counts[8]++;
                    break;
                case 9:
                    counts[9]++;
            }
        }
        return counts;
    }

    private static void fillRandomly(ArrayList<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 10));
        }
    }
}
