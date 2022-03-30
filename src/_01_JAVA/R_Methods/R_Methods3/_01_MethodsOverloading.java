package _01_JAVA.R_Methods.R_Methods3;

public class _01_MethodsOverloading {
    /*
    Method overloading is a concept in java, which we can create multiple methods
    with the SAME NAME of the class, and all the methods work in different ways
     */

    public static void main(String[] args) {

        System.out.println("Sum of 2 integers: " + sum(9, 11));
        System.out.println("Sum of 2 doubles: " + sum(5.3, 3.7));

        System.out.println("Sum of 3 integers: " + sum(10, 20, 30));
        System.out.println("Sum of 3 doubles: " + sum(9.3, 7.2, 23.64));

        // sum(50, 30, 10, 20): -> we cannot do it like this,
        // because we did not overload sum method for 4 parameters
    }

    // now our 'sum' method can accept different types of variables under the same name
    // overloaded version of method
    // main thing - method parameters should be different.
    // for example, there cannot be two exactly the same methods like 'int sum'

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

}
