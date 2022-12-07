package chapters.extra.arrayList;

import java.util.Arrays;

public class E20_01 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java E20_01 \"Text\"");
            System.exit(0);
        }
        String text = args[0];
        String[] words = text.split(" ");
        Arrays.sort(words);
        display(words);
    }

    public static void display(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
