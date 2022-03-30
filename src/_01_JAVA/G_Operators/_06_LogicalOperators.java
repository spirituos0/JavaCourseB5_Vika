package _01_JAVA.G_Operators;

public class _06_LogicalOperators {
    public static void main(String[] args) {

        int temperature = 25;
        boolean isWarm = temperature < 30 && temperature > 20; // AND operator &&
        // if one of the condition s false, then the whole expression will be false
        // both conditions need to be true
        System.out.println(isWarm);


        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;

        boolean isEligible = hasGoodCredit || hasHighIncome; // OR operator
        // if one of the conditions are true, result will be true
        boolean isEligible2 = hasGoodCredit && hasHighIncome;
        System.out.println(isEligible);
        System.out.println(isEligible2);




    }
}
