package chapters.chapter05.exercises;

public class Exercise539 {
    public static void main(String[] args) {
        double commision = 0;
        double salary = 5000;
        double sales = 0;
        while(commision + salary <= 30000){
            commision = 0;
            commision += 5000 * 0.08;
            commision += 5000 * 0.10;
            commision += (sales - 10000) * 0.12;
            sales += 0.0001;
        }
        System.out.printf("If you want to earn 30000 in a year, your sales should be $%1.3f",sales);
    }
}
