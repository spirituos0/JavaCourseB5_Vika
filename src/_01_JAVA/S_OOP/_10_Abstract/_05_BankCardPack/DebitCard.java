package _01_JAVA.S_OOP._10_Abstract._05_BankCardPack;

public class DebitCard extends BankCard {

    public DebitCard(String name, int SSN) {
        super(name, SSN);
    }
    @Override
    public void deposit(double moneyToDeposit) {
        if (moneyToDeposit <= 0)
            throw new IllegalArgumentException("You cannot deposit this amount");
        setBalance(getBalance() + moneyToDeposit);
    }
    @Override
    public void withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw <= 0)
            throw new IllegalArgumentException("You cannot withdraw this amount");
        if (getBalance() < moneyToWithdraw)
            throw new IllegalArgumentException("You cannot withdraw this amount");
        setBalance(getBalance() - moneyToWithdraw);
    }
}
