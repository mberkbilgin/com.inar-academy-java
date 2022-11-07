package chapters.chapter05.Listings;

public class Listing510 {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;

        while(tuition < 20000){
            tuition *= 1.07;
            year++;
        }
        System.out.printf("Tuition will be doubled in %d years and it is $%.2f", year, tuition);

    }
}
