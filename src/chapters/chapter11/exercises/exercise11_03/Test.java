package chapters.chapter11.exercises.exercise11_03;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(68541, 97_536);
        CheckingAccount account1 = new CheckingAccount(6541, 76_465, 5_000);
        SavingAccount account2 = new SavingAccount(3848, 98_464);
        account1.withdraw(45_649);
        account2.deposit(6_541);
        account.setAnnualInterestRate(3.5);
        account1.setAnnualInterestRate(4.8);
        account2.setAnnualInterestRate(2.4);
        System.out.println(account);
        System.out.println(account1);
        System.out.println(account2);
    }
}
