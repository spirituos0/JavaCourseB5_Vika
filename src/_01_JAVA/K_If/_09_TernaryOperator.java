package _01_JAVA.K_If;

public class _09_TernaryOperator {

    public static void main(String[] args) {

        int income = 120_000;
        String className = income > 100_000 ? "First Class" : "Economy Class";
        System.out.println(className);
        
        /* explanation of everything above:
        if (?) income is greater than 100,000 then "First Class".
        else (:) - "Economy Class"
         */

       /* if (income > 100_000) {
            className = "First Class"; }
        // avoid declaring anything inside of statement.
        // Better to do it outside, above
        else {
            className = "Economy Class";

        } */

    }
}
