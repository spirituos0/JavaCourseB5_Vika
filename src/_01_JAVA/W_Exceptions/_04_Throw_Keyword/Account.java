package _01_JAVA.W_Exceptions._04_Throw_Keyword;

public class Account {

    double balance;

    public void deposit(double moneyToDeposit) {

        if (moneyToDeposit <= 0) {
            throw new IllegalArgumentException();
        }
        balance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw > balance) {
            throw new IllegalArgumentException();
        }
        balance -= moneyToWithdraw;
    }



}
