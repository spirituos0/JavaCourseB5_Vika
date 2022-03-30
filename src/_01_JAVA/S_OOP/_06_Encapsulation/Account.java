package _01_JAVA.S_OOP._06_Encapsulation;
// task 1 homework
public class Account {

    private String userId;
    private double balance;

    public Account(String userId) {
        this.userId = userId;
    }
    // getter
    public String getUserId() {
        return userId;
    }
    public double getBalance() {
        return balance;
    }
    // setter
    public void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be less than 0");
        this.balance = balance;
    }


}
