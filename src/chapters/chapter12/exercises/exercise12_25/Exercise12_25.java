package chapters.chapter12.exercises.exercise12_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_25 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("There is a file with this name already");
            System.exit(0);
        }
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 1; i <= 1000; i++) {
                String rank = getRank();
                String salary = getSalary(rank);
                output.println("FirstName" + i + " LastName" + i + " " + rank + " " + salary);
            }
        }
        int countAssi = 0;
        int countAsso = 0;
        int countFull = 0;
        double salAssi = 0;
        double salAsso = 0;
        double salFull = 0;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                String rank = input.next();
                if (rank.equals("assistant")) {
                    countAssi++;
                    salAssi += Double.parseDouble(input.next());
                } else if (rank.equals("associate")) {
                    countAsso++;
                    salAsso += Double.parseDouble(input.next());
                } else {
                    countFull++;
                    salFull += Double.parseDouble(input.next());
                }


            }
            System.out.println("Total salary of assistant is " + salAssi);
            System.out.println("Average salary of assistant is " + countAssi);
            System.out.println("Total salary of associate is " + salAsso);
            System.out.println("Average salary of associate is " + countAsso);
            System.out.println("Total salary of full is " + salFull);
            System.out.println("Average salary of full is " + countFull);

        }
    }


    private static String getSalary(String rank) {
        switch (rank) {
            case "assistant":
                return Math.random() * (80_000 - 50_000) + "";
            case "associate":
                return Math.random() * (110_000 - 60_000) + "";
            case "full":
                return Math.random() * (130_000 - 75_000) + "";

        }
        return "";
    }

    private static String getRank() {
        int number = (int) (Math.random() * 3);
        switch (number) {
            case 0:
                return "assistant";
            case 1:
                return "associate";
            case 2:
                return "full";
        }
        return "";
    }
}
