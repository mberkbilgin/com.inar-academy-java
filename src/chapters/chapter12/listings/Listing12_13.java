package chapters.chapter12.listings;

import java.io.IOException;
import java.io.PrintWriter;

public class Listing12_13 {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();
    }
}
