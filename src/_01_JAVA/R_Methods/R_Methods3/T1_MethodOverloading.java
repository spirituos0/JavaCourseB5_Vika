package _01_JAVA.R_Methods.R_Methods3;

public class T1_MethodOverloading {

    public static void main(String[] args) {


        System.out.println("Product of 2 integers: " + product(28, 3));
        System.out.println("Product of 3 integers: " + product(4, 7, 9));

        System.out.println("Product of 2 doubles: " + product(5.3, 3.84));
        System.out.println("Product of 3 doubles: " + product(2.5, 7.28, 45.32));

        System.out.println("Product of 1 integer and 1 double: " + product(7, 3.4));
        System.out.println("Product of 1 double and 1 integer: " + product(6.1, 2));
    }


    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static int product(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static double product(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static double product(int num1, double num2) {
        return num1 * num2;
    }

    public static double product(double num1, int num2) {
        return num1 * num2;
    }
}
