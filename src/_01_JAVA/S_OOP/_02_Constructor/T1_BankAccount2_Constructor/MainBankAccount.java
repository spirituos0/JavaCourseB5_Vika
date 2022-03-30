package _01_JAVA.S_OOP._02_Constructor.T1_BankAccount2_Constructor;

public class MainBankAccount {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Emily", 111111111, "Brooklyn");
        // we need to initialize object here, because we made a constructor
        // it looks better too, cleaner and shorter.
        // we use same constructor for all the objects we create. 'template'

        // Below is version without the constructor, where we initialize fields every time separately
//        BankAccount bankAccount1 = new BankAccount();
//        bankAccount1.customerName = "Emily";
//        bankAccount1.customerSSN = 12345678;
//        bankAccount1.city = "Brooklyn";

        System.out.println(bankAccount1.customerName);
        System.out.println(bankAccount1.customerSSN);
        System.out.println(bankAccount1.city);

        BankAccount bankAccount2 = new BankAccount("James", 48238972); // it works, because city is optional



    }
}
