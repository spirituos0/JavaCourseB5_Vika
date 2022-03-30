package _01_JAVA.K_If;

public class _05_IfInsideIf {
    public static void main(String[] args) {

        boolean hasHighIncome = true;
        int creditScore = 650;

        if (hasHighIncome) {
            if (creditScore > 720) {
                System.out.println("You are eligible for loan!");
            } else {
                System.out.println("Your credit score is not good enough for loan!");
            }
        } else {
            System.out.println("You are not eligible for loan!!!");
        }
    }
}
