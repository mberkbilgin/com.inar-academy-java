package chapters.chapter12.exercises.exercise12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercise12_24 {
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
