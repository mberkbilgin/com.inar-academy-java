package chapters.chapter09.exercises.exercise09_02;

public class Exercise09_02_Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Exercise09_02_Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return (Math.abs(currentPrice - previousClosingPrice) / previousClosingPrice) * 100.0;
    }



}
