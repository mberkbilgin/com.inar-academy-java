package chapters.chapter12.exercises.exercise12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_21 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_11 filename");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + file + " doesn't exist");
            System.exit(1);
        }
        if (isSort(file)) {
            System.out.println("It's sorted!");
        } else {
            System.out.println("It's not sorted!");
            System.out.println("The first two string is");
            display(file);
        }
    }

    private static boolean isSort(File file) throws FileNotFoundException {
        String str1 = "";
        String str2 = null;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {

                str1 = input.next();
                if (str2 != null) {
                    if (str2.compareToIgnoreCase(str1) > 0) {
                        return false;
                    }
                }
                str2 = str1;
            }
            return true;
        }
    }

    private static void display(File file) throws FileNotFoundException {
        String str1 = "";
        String str2 = null;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {

                str1 = input.next();
                if (str2 != null) {
                    if (str2.compareToIgnoreCase(str1) > 0) {
                        System.out.println(str2);
                        System.out.println(str1);
                        return;
                    }
                }
                str2 = str1;
            }
        }
    }

}