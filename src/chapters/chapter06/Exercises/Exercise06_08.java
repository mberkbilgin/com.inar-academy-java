package chapters.chapter06.Exercises;

public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.println("Celcius    Fahrenheit  |   Fahrenheit   Celcius");
        System.out.println("------------------------------------------------");
        for (double i = 40,  j = 120; i >= 31 &&  j >= 30 ; i--, j -= 10) {
            System.out.printf("%-3.1f%14.2f     |",i,celsiusToFahrenheit(i));
            System.out.printf("%8.1f%15.2f\n",j,fahrenheitToCelsius(j));
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius +32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return  celcius;
    }
}
