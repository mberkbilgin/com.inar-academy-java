package chapters.chapter07.exercises;

public class Exercise07_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int[] pick = new int[4];
        fillInTheBlank(deck);
        shuffle(deck);

        int count = 0;
        do {
            pickCard(deck, pick);
            count++;
        } while (!isOneOfEachSuit(pick));

        display(pick);
        System.out.println("Number of picks is " + count);
    }

    public static void display(int[] pick) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < pick.length; i++) {
            System.out.println(ranks[pick[i] % 13] + " of " + suits[pick[i] / 13]);
        }
    }

    public static boolean isOneOfEachSuit(int[] pick) {
        for (int i = 0; i < pick.length - 1; i++) {
            for (int j = i + 1; j < pick.length; j++) {
                if (pick[i] / 13 == pick[j] / 13) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void pickCard(int[] deck, int[] pick) {
        for (int i = 0; i < pick.length; i++) {
            pick[i] = deck[(int) (Math.random() * 52)];
        }
    }

    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = (int) (Math.random() * 52);
            int temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }
    }

    public static void fillInTheBlank(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }
}
