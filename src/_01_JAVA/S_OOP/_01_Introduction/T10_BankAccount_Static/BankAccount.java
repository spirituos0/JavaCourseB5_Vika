package _01_JAVA.S_OOP._01_Introduction.T10_BankAccount_Static;

public class BankAccount {

    static String customerName;
    double customerBalance = 0;
    static double totalBalance = 0;

    public void deposit(double moneyToDeposit) {
        customerBalance += moneyToDeposit;
        totalBalance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) {
        customerBalance -= moneyToWithdraw;
        totalBalance -= moneyToWithdraw;

    }


}
