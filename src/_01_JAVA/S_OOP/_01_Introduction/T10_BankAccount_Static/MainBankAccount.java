package _01_JAVA.S_OOP._01_Introduction.T10_BankAccount_Static;

public class MainBankAccount {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.customerName = "Mark";
        System.out.println(bankAccount1.customerBalance); // 0.0

        bankAccount1.deposit(5000);
        System.out.println(bankAccount1.customerBalance); // +5000

        bankAccount1.withdraw(500);
        System.out.println(bankAccount1.customerBalance); // -500 = 4500

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.customerName = "Emily";

        bankAccount2.deposit(1200);
        System.out.println(bankAccount2.customerBalance);
    }
}
