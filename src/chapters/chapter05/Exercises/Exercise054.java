package chapters.chapter05.Exercises;

public class Exercise054 {
    public static void main(String[] args) {
        System.out.println("Miles       Kilometres");
        int miles = 1;
        while(miles <= 10){
            double km = miles * 1.609;
            System.out.printf("%d%14.2f\n",miles,km);
            miles++;
        }
    }
}
