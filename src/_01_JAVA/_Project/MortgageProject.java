package _01_JAVA._Project;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageProject {
    /*
    M = monthly payment
    P = principal. total about of a loan
    i = annual interest rate
    n = number of payments
     */

    public static void main(String[] args) {

        // to keep this number static and final. no possibility to change
        final byte MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;

        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = sc.nextDouble(); // P

        while (principal < 1_000 || principal > 1_000_000) {
            System.out.print("Enter valid principal between 1,000 and 1,000,000: ");
            principal = sc.nextDouble();
        }

        System.out.print("Annual interest rate: ");
        float annualInterestRate = sc.nextFloat();

        while (annualInterestRate < 1 || annualInterestRate > 30) {
            System.out.print("Enter a value between 1 and 30: ");
            annualInterestRate = sc.nextFloat();
        }

        float monthlyInterestRate = (annualInterestRate / PERCENT) / MONTHS_IN_A_YEAR;

        System.out.print("Period (years): ");
        int termInYears = sc.nextInt(); // take info from user in years, but gotta convert it into months

        while (termInYears < 1 || termInYears > 30) {
            System.out.println("Enter a value between 1 and 30: ");
            termInYears = sc.nextInt();
        }

        int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;

        double mortgage = principal * (
                monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        System.out.println("Monthly payment: " +
                NumberFormat.getCurrencyInstance().format(mortgage));
        System.out.println("Total payback amount: " +
                NumberFormat.getCurrencyInstance().format(mortgage * numberOfPayments));

    }
}

