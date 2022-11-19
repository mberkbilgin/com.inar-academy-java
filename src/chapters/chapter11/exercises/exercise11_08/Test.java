package chapters.chapter11.exercises.exercise11_08;

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account("George",1122,1000);
        account1.setAnnualInterestRate(1.5);
        account1.deposit(30);
        account1.deposit(40);
        account1.deposit(50);
        account1.withdraw(5);
        account1.withdraw(4);
        account1.withdraw(2);
        System.out.println(account1.toString());

    }
}
