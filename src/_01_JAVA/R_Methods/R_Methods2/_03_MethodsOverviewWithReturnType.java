package _01_JAVA.R_Methods.R_Methods2;

public class _03_MethodsOverviewWithReturnType {

    public static void main(String[] args) {
        int sum = sumThreeIntegers(10, 20, 30);
        System.out.println(sum);

        int sum2 = sumFourDoubles(10, 20, 30, 40);

    }
// This method will accept 3 integers as parameters and return the sum of numbers
    public static int sumThreeIntegers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;

    }

    public static int sumFourDoubles(double num1, double num2, double num3, double num4) {
        int sum2 = (int) (num1 + num2 + num3 + num4);
        return sum2;
    }

}
