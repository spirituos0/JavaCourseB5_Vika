package _01_JAVA.S_OOP._01_Introduction.T11_Calculus;

public class Calculus {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return Math.abs(num1 - num2); // we use Math here to make this result absolute,
        // in case in num1 is less than num2
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }


}
