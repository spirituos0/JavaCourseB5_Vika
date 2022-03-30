package _01_JAVA.K_If;

public class _06_NestedIf {
    public static void main(String[] args) {

        boolean condition = true;
        boolean anotherCondition = false;

        if (condition) {

            if (anotherCondition) {
                System.out.println("Condition 2 is true!");
            } else {
                System.out.println("Condition 1 is true!");
            }

        } else {
            System.out.println("No condition is true!");
        }
    }
}
