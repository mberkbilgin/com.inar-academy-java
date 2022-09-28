package chapters.chapter05.Exercises;

public class Exercise540 {
    public static void main(String[] args) {
        int head = 0;
        int tails = 0;
        for (int i = 0; i < 1_000_000; i++) {
            int coin = (int)(Math.random()*2);
            if (coin == 0)
                head++;
            else
                tails++;
        }
        System.out.println("Number of heads is "+head);
        System.out.println("Number of tails is "+tails);
    }
}
