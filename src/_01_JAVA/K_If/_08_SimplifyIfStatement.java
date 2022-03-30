package _01_JAVA.K_If;

public class _08_SimplifyIfStatement {

    public static void main(String[] args) {

        int income = 80_000;
        /*
        boolean hasHighIncome = false; // by default

        if (income > 100_000) {
            hasHighIncome = true;
        }
         */
        // variable is declared inside of this code block
        // to solve this we need to declare it outside
        // since it's false by defalt, we don't really need 'else'
        // {} are not mandatory if you have only 1 line of expression

        boolean hasHighIncome = income > 100_000;
        // in this task this solution would be perfect.
        // Short, clean and it works same way as with 'if else'

        System.out.println("Your income is high: " + hasHighIncome);


    }
}
