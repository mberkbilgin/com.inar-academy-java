package chapters.chapter06.Exercises;

import chapters.chapter06.Listings.Listing06_10;

public class Exercise06_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 0){
                System.out.println(Listing06_10.getRandomUpperCase());
            }else
                System.out.print(Listing06_10.getRandomUpperCase() + " ");
        }
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 0){
                System.out.println(Listing06_10.getRandomDigitCharacter());
            }else
                System.out.print(Listing06_10.getRandomDigitCharacter() + " ");

        }

    }
}
