package _01_JAVA.R_Methods;

public class T_MethodsWithReturnType {

    public static void main(String[] args) {
        System.out.println(multiplicationOfTwoNumbers(10, 55));
    }
    public static int multiplicationOfTwoNumbers(int number1, int number2) {
        int multiplication = number1 * number2;
        return multiplication;
    }
}

