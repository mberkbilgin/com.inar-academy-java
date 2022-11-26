package chapters.chapter12.exercises.exercise12_15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_15 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\MBB\\Desktop\\Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("There is already a file with the same name");
            System.exit(1);
        }
        fillRandomly(file, 100);

        ArrayList<Integer> list = sorting(file);

        display(list);
    }

    public static void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if ((i+1) % 10 == 0) {
                System.out.print(i + " ");
                System.out.println();
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static ArrayList<Integer> sorting(File file) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void fillRandomly(File file, int limit) throws Exception {
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 0; i < limit; i++) {
                int number = (int) (Math.random() * 1000);
                output.print(number + " ");
            }
        }
    }
}
