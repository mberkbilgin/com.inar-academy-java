package chapters.chapter11.exercises.exercise11_03;


public class SavingAccount extends Account {

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void deposit(double amount) {

        setBalance(getBalance() + amount);
    }

    public String toString(){
        return "ClassName is SavingAccount\nThe balance is " + getBalance() + "\nMonthly interest rate is " + getMonthlyInterestRate() + "\nAnnual interest rate is " + getAnnualInterestRate();
    }
}
