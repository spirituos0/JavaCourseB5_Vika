package _01_JAVA.E_Arithmetics;

public class _04_Division {

    public static void main(String[] args) {

        // Division using only values
        System.out.println(9 / 3);

        // Division using only variable
        int x = 45;
        int y = 5;

        System.out.println(x / y);

        int result = x / y;
        System.out.println(result);

        // Division using value and variable
        System.out.println(result / 3);

        // System.out.println(15 / 0); <- impossible
        int a = 25; // 25.0 in double
        int b = 4; // 4.0 in double
        // so the result would be incorrect

        /*  int result2 = a / b;
        System.out.println(result2); // result is rounded to down, because it's integer */

        double result2 = (double) a / (double) b; // converted into double
        // only then in an expression like this 25/4 will be correct answer
        System.out.println(result2);

    }


}
