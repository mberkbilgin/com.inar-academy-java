package chapters.chapter11.exercises.exercise11_03;



public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        overdraftLimit = 500;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    @Override
    public void withdraw(double amount){
        if(getBalance() - amount >= 0 - getOverdraftLimit()){
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Your limit is not enough!");
        }
    }
    public String toString(){
        return "ClassName is CheckingAccount\nThe balance is " + getBalance() + "\nMonthly interest rate is " + getMonthlyInterestRate() + "\nAnnual interest rate is " + getAnnualInterestRate();
    }

}
