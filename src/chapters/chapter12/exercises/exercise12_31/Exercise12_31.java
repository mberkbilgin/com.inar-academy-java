package chapters.chapter12.exercises.exercise12_31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        String year = input.next();

        System.out.println("Enter gender: ");
        String gender = input.next();

        System.out.println("Enter name: ");
        String name = input.next();

        File file = new File("babynameranking" + year + ".txt");
        if (!file.exists()) {
            System.out.println("No record for " + year);
            System.exit(0);
        }

        int rank = getRank(gender, name, file);
        if (rank == -1) {
            System.out.println("That name is not found");
        } else {
            System.out.println(name + " is ranked #" + rank + " in year " + year);
        }
    }

    public static int getRank(String gender, String name, File file) throws FileNotFoundException {
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                int rank = input.nextInt();
                String maleBabyName = input.next();
                double maleBabyBirthRate = input.nextDouble();
                String femaleBabyName = input.next();
                double femaleBabyBirthRate = input.nextDouble();
                if ((name.equalsIgnoreCase(maleBabyName) && gender.equalsIgnoreCase("M")) ||
                        (name.equalsIgnoreCase(femaleBabyName) && gender.equalsIgnoreCase("F"))) {
                    return rank;
                }
            }
        }
        return -1;
    }
}
