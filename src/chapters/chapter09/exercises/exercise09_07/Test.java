package chapters.chapter09.exercises.exercise09_07;

public class Test {
    public static void main(String[] args) {
        Exercise09_07_Account account = new Exercise09_07_Account(1122,20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account id " + account.getId());
        System.out.println("The balance of account is " + account.getBalance() + "\nThe monthly interest rate is %" + account.getMonthlyInterestRate() + "\nThe date is " + account.dateCreated);
    }
}
