package chapters.chapter05.Exercises;

public class Exercise056 {
    public static void main(String[] args) {
        System.out.println("Miles   Kilometres   |   Kilometres   Miles");
        for(int miles = 1, km = 20; miles <= 10 && km <= 65; miles++, km +=5){
            System.out.printf("%-4d%9.2f",miles,(miles*1.609));
            System.out.printf("        |    ");
            System.out.printf("%-4d%13.2f\n",km,(km/1.609));
        }
    }
}
