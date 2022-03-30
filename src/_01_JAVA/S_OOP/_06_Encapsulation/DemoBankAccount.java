package _01_JAVA.S_OOP._06_Encapsulation;

public class DemoBankAccount {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Vika123", Currency.USD);

        System.out.println(bankAccount1.getUserId());
        System.out.println(bankAccount1.getCurrency());

        bankAccount1.deposit(5000); // this amount of money will be added to my bank account
        System.out.println(bankAccount1.getBalance());

        bankAccount1.withdraw(1500); // this amount of money I withdraw from my balance
        System.out.println(bankAccount1.getBalance());

//        bankAccount1.withdraw(10000); <- error, because it's more than the balance

    }



}
