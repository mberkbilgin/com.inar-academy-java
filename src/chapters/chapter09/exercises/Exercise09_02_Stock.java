package chapters.chapter09.exercises;

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

    public static void main(String[] args) {
        Exercise09_02_Stock stock = new Exercise09_02_Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.printf("The price-change percentage of stock of symbol %s and name %s is %%%.3f", stock.symbol, stock.name, stock.getChangePercent(), "%");
    }

}
