package chapters.chapter10.exercises.exercise10_07;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {

        Account account0 = new Account(0, 100);
        Account account1 = new Account(1, 100);
        Account account2 = new Account(2, 100);
        Account account3 = new Account(3, 100);
        Account account4 = new Account(4, 100);
        Account account5 = new Account(5, 100);
        Account account6 = new Account(6, 100);
        Account account7 = new Account(7, 100);
        Account account8 = new Account(8, 100);
        Account account9 = new Account(9, 100);

        whichAccount(account0, account1, account2, account3, account4, account5, account6, account7, account8, account9);


    }


    public static void whichAccount(Account account0, Account account1, Account account2, Account account3, Account account4, Account account5, Account account6, Account account7, Account account8, Account account9) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an id:");
        int id = input.nextInt();
        if (id == account0.getId()) {
            menu(account0, account1, account2, account3, account4, account5, account6, account7, account8, account9);
        } else if (id == account1.getId()) {
            menu(account1, account0, account2, account3, account4, account5, account6, account7, account8, account9);
        } else if (id == account2.getId()) {
            menu(account2, account0, account1, account3, account4, account5, account6, account7, account8, account9);
        } else if (id == account3.getId()) {
            menu(account3, account0, account1, account2, account4, account5, account6, account7, account8, account9);
        } else if (id == account4.getId()) {
            menu(account4, account5, account6, account7, account8, account9, account0, account1, account2, account3);
        } else if (id == account5.getId()) {
            menu(account5, account6, account7, account8, account9, account0, account1, account2, account3, account4);
        } else if (id == account6.getId()) {
            menu(account6, account7, account8, account9, account0, account1, account2, account3, account4, account5);
        } else if (id == account7.getId()) {
            menu(account7, account8, account9, account0, account1, account2, account3, account4, account5, account6);
        } else if (id == account8.getId()) {
            menu(account8, account9, account0, account1, account2, account3, account4, account5, account6, account7);
        } else if (id == account9.getId()) {
            menu(account9, account0, account1, account2, account3, account4, account5, account6, account7, account8);
        } else {
            System.out.println("You entered invalued number. Try again");
            whichAccount(account0, account1, account2, account3, account4, account5, account6, account7, account8, account9);


        }
    }

    public static void menu(Account account, Account x, Account y, Account z, Account a, Account b, Account c, Account d, Account e, Account f) {

        Scanner input = new Scanner(System.in);
        System.out.println("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
        System.out.println("Enter a choice");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("The balance is " + account.getBalance());
            System.out.println("____________________________");
            menu(account, x, y, z, a, b, c, d, e, f);
        } else if (number == 2) {
            System.out.println("Enter an amount to withdraw");
            double withdraw = input.nextDouble();
            while (account.getBalance() < withdraw) {
                System.out.println("Your balance is " + account.getBalance() + "\nPlease enter valid value!");
                withdraw = input.nextInt();
            }
            account.withdraw(withdraw);
            System.out.println("____________________________");
            menu(account, x, y, z, a, b, c, d, e, f);

        } else if (number == 3) {
            System.out.println("Enter an amount to deposit");
            double deposit = input.nextDouble();
            account.deposit(deposit);
            System.out.println("____________________________");
            menu(account, x, y, z, a, b, c, d, e, f);

        } else if (number == 4) {
            whichAccount(account, x, y, z, a, b, c, d, e, f);
        } else {
            System.out.println("You entered invalued number. Try again");
            menu(account, x, y, z, a, b, c, d, e, f);
        }


    }


}
