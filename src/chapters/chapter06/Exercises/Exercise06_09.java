package chapters.chapter06.Exercises;

public class Exercise06_09 {
    public static void main(String[] args) {
        System.out.println("Feet    Meters    |   Meters     Feet");
        System.out.println("--------------------------------------");
        for (double i = 1,  j = 20; i <= 10 &&  j <= 65 ; i++, j += 5) {
            System.out.printf("%-8.1f%-4.3f     |",i,footToMeter(i));
            System.out.printf("%8.1f%10.3f\n",j,meterToFoot(j));
        }
    }
    public static double footToMeter(double foot){
        double meter = foot * 0.305;
        return meter;
    }
    public static double meterToFoot(double meter){
        double feet = meter * 3.279;
        return feet;
    }


}
