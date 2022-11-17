package chapters.chapter11.exercises.exercise11_03;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    Date dateCreated;

    Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account(int id, double balance){
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

    public String toString(){
        return "ClassName is Account\nThe balance is " + getBalance() + "\nMonthly interest rate is " + getMonthlyInterestRate() + "\nAnnual interest rate is " + getAnnualInterestRate();
    }

}


