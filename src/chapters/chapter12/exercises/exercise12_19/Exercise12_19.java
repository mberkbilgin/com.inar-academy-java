package chapters.chapter12.exercises.exercise12_19;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://kr.usembassy.gov/abraham-lincolns-gettysburg-address-1863/");
        String line;
        String[] arr;
        int count = 0;
        try (
                Scanner input = new Scanner(url.openStream())
        ) {
            while (input.hasNext()) {
                line = input.nextLine() + "\n";
                arr = line.split(" ");
                count += arr.length;
            }
        }
        System.out.println("The url address has " + count + " words");
    }
}
