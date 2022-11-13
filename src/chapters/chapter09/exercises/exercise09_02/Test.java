package chapters.chapter09.exercises.exercise09_02;

public class Test {
    public static void main(String[] args) {
        Exercise09_02_Stock stock = new Exercise09_02_Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.printf("The price-change percentage of stock of symbol %s and name %s is %%%.3f", stock.symbol, stock.name, stock.getChangePercent(), "%");
    }
}
