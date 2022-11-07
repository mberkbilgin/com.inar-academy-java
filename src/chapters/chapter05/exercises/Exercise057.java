package chapters.chapter05.exercises;

public class Exercise057 {
    public static void main(String[] args) {
        double tuition = 10000;
        int totalFourth = 0;
        System.out.println("Year     Tuition");
        for(int year = 1; year <= 14; year++){
            tuition += tuition * 0.05;
            System.out.printf("%-9d$%7.1f\n",year,tuition);
            if(year > 10)
                totalFourth += tuition;
        }
        System.out.println("Total cost for four years' worth of tuiton after the tenth year: $" + totalFourth);


    }
}
