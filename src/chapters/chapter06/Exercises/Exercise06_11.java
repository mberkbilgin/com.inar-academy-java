package chapters.chapter06.Exercises;

public class Exercise06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount         Commission");
        System.out.println("--------------------------------");
        for (int i = 10000; i < 100000 ; i += 5000) {
            System.out.printf("%d%25.1f\n",i,computeCommission(i));
        }
    }
    public static double computeCommission(double salesAmount){
            double commission = 0;
            commission += 5000 * 0.08;
            commission += 5000 * 0.1;
            commission += (salesAmount -10000) * 0.12;
            return commission;
    }
}
