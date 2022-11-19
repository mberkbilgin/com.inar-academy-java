package chapters.chapter11.exercises.exercise11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    protected String name;
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    Date dateCreated;

    protected ArrayList<Transaction> transactions;

    public Account() {
        this("",0,0);
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setName(String name) {
        this.name = name;
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
        Transaction transaction = new Transaction('W',amount,getBalance(),getName());
        setBalance(getBalance() - amount);
        transactions.add(transaction);
    }

    public void deposit(double deposit) {
        Transaction transaction = new Transaction('D',deposit,getBalance(),getName());
        setBalance(getBalance() + deposit);
        transactions.add(transaction);
    }
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
            sb.append(transactions.get(i));
        }
        return "Name: " + getName() + "\nBalance: " +getBalance() + "\nMonthly Interest: " + getMonthlyInterestRate()
                + "\nCreated Date: " + getDateCreated() + "\nTransactions: " + sb;
    }
}

