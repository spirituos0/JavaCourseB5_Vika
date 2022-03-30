package _01_JAVA.S_OOP._09_Polymorphism.CompileTime;

public class Calculation {

    public static void sum(int number1, int number2) {
        System.out.println("Sum of 2 integers: " + (number1 + number2));
    }
    // overloading:
    public static void sum(int number1, int number2, int number3) {
        System.out.println("Sum of 3 integers: " + (number1 + number2 + number3));
    }
    // overload again
    public static void sum(double number1, double number2) {
        System.out.println("Sum of 2 doubles: " + (number1 + number2));
    }
    public static void sum(double number1, double number2, double number3) {
        System.out.println("Sum of 3 doubles: " + (number1 + number2 + number3));
    }


    public static void multiplication(int number1, int number2) {
        System.out.println("Product of 2 integers: " + (number1 * number2));
    }
    public static void multiplication(int number1, int number2, int number3) {
        System.out.println("Product of 3 integers: " + (number1 * number2 * number3));
    }
    public static void multiplication(double number1, double number2) {
        System.out.println("Product of 2 doubles: " + (number1 * number2));
    }
    public static void multiplication(double number1, double number2, double number3) {
        System.out.println("Product of 3 double: " + (number1 * number2 * number3));
    }


    public static void subtract(int number1, int number2) {
        System.out.println("Subtract of 2 integers: " + (number1 - number2));
    }
    public static void subtract(int number1, int number2, int number3) {
        System.out.println("Subtract of 3 integers: " + (number1 - number2 - number3));
    }
    public static void subtract(double number1, double number2) {
        System.out.println("Subtract of 2 doubles: " + (number1 - number2));
    }
    public static void subtract(double number1, double number2, double number3) {
        System.out.println("Subtract of 3 doubles: " + (number1 - number2 - number3));
    }
}

