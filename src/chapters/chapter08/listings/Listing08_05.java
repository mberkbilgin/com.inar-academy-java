package chapters.chapter08.listings;

import java.util.Scanner;

public class Listing08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day][hour][0] = temperature;
            data[day][hour][1] = humidity;
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;

            for (int k = 0; k < NUMBER_OF_DAYS; k++) {
                double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
                for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                    dailyTemperatureTotal += data[k][j][0];
                    dailyHumidityTotal += data[k][j][1];
                }
                System.out.println("Day " + i + "'s average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
                System.out.println("Day " + i + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
            }

        }
    }
}
