package _01_JAVA.S_OOP._02_Constructor.T1_BankAccount2_Constructor;

public class BankAccount {

    // Every class has a constructor even we did not create any (default constructor)
    // Constructor will always have the same name with class

    // Method vs Constructor:

    // Constructor will always have the SAME NAME with the CLASS, but
    // Method can have ANY NAME

    // Constructor doesn't need any return even void
    // Method should have a return type at least void

    // Constructor will be created automatically by JVM (default constructor)
    // Method will not be created automatically

    // We use Constructor to initialize instance of an object
    // We use Method to perform actions (they are functions)

    String customerName;
    int customerSSN;
    String city;
    double customerBalance = 0;
    static double totalBalance = 0;

    // constructor. We don't use any return type, nor void or anything else.
    // it helps to 'force' customer to fill out this, otherwise, we are not able to create an object
    // ex.: without providing Name or SSN we cannot open Bank Account

    public BankAccount(String customerName, int customerSSN) {
        // now we have only 2 necessary parameters; 'city' is optional, but Name and SSN are required
        this.customerName = customerName;
        this.customerSSN = customerSSN;
    }

    // constructor overloading:
    public BankAccount(String customerName, int customerSSN, String city) {
        this.customerName = customerName;
        this.customerSSN = customerSSN;
        this.city = city;
    }

    public void deposit(double moneyToDeposit) {
        customerBalance += moneyToDeposit;
        totalBalance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) {
        customerBalance -= moneyToWithdraw;
        totalBalance -= moneyToWithdraw;

    }


}
