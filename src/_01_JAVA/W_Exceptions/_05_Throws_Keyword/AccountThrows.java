package _01_JAVA.W_Exceptions._05_Throws_Keyword;

import java.io.IOException;

public class AccountThrows {

    double balance;

    public void deposit(double moneyToDeposit) throws IOException {
        // actually this method cannot throw an exception, so to do that, we need to handle it by making 'throws exception'
        if (moneyToDeposit <= 0) {
            throw new IOException();
        }
        balance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) throws IOException {
        if (moneyToWithdraw > balance) {
            throw new IOException();
        }
        balance -= moneyToWithdraw;
    }
}
