package chapters.chapter09.exercises;

import java.util.Date;

public class Exercise09_07_Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Exercise09_07_Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }
    Exercise09_07_Account(int id, int balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = (getAnnualInterestRate() / 100) / 12;
        return getBalance() * monthlyInterestRate;
    }
    public void withdraw(double amount){
        setBalance(getBalance() - amount);
    }
    public void deposit(double deposit){
        setBalance(getBalance() + deposit);
    }

    public static void main(String[] args) {
        Exercise09_07_Account account = new Exercise09_07_Account(1122,20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account id " + account.getId());
        System.out.println("The balance of account is " + account.getBalance() + "\nThe monthly interest rate is %" + account.getMonthlyInterestRate() + "\nThe date is " + account.dateCreated);
    }
}
