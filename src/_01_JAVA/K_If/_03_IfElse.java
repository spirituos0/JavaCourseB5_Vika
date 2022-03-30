package _01_JAVA.K_If;

public class _03_IfElse {
    public static void main(String[] args) {

        int income = 75_000;

        if (income > 100_000) {
            System.out.println("Your income is high");
        } else if (income >= 20_000) {
            System.out.println("Your income is fair");
        } else {
            System.out.println("Your income is low");
        }
    }
}
