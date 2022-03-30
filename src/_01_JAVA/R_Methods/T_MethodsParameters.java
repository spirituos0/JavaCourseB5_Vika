package _01_JAVA.R_Methods;

public class T_MethodsParameters {

    public static void main(String[] args) {
        sumOfTwoNumbers(10, 20);

    }

    public static void sumOfTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

}

