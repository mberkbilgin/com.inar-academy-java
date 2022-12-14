package chapters.chapter10.exercises.exercise10_08;

public class Tax {
    private static final int SINGLE_FILER = 0;
    private static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    private static final int MARRIED_SEPARATELY = 2;
    private static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this(SINGLE_FILER, null, null, 0);

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        if (taxableIncome < brackets[filingStatus][0]) {
            return 0;
        }
        double tax = 0;
        for (int i = brackets[filingStatus].length - 1; i >= 0; i--) {
            if (taxableIncome > brackets[filingStatus][i]) {
                tax += (taxableIncome - brackets[filingStatus][i]) * rates[i + 1];
                taxableIncome = brackets[filingStatus][i];
            }
        }
        tax += brackets[filingStatus][0] * rates[0];
        return tax;
    }
}
