package chapters.chapter12.listings;

import java.io.PrintWriter;

public class Listing12_14 {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.out.println(0);
        }
        try (
            PrintWriter output = new PrintWriter(file);
        ){
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
