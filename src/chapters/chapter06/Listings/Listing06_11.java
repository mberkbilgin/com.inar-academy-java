package chapters.chapter06.Listings;

public class Listing06_11 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHAR_PER_LINE = 25;

        for (int i = 1; i <= NUMBER_OF_CHARS; i++) {
            char ch = Listing06_10.getRandomLowerCharacter();
            if (i % CHAR_PER_LINE == 0){
                System.out.println(ch);
            }else
                System.out.print(ch);

        }

    }
}
