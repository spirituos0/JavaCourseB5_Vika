package _01_JAVA.S_OOP._06_Encapsulation;

public class BankAccount {

    private String userId;
    private Currency currency;
    private double balance = 0;

    // getter
    public String getUserId() {
        return userId;
    }
    public double getBalance() {
        return balance;
    }
    public Currency getCurrency() {
        return currency;
    }

    // constructors
    public BankAccount(String userId, Currency currency) {
        this.userId = userId;
        this.currency = currency;
    }

    // setter
    public double setBalance(double balance) {
        return balance;
    }

    public void deposit(double moneyToDeposit) {
        balance += moneyToDeposit;
    }
    public void withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw > 0)
            throw new IllegalArgumentException("You cannot withdraw more than your balance");
        balance -= moneyToWithdraw;
    }
}
