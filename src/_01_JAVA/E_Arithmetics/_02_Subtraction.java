package _01_JAVA.E_Arithmetics;

public class _02_Subtraction {

    public static void main(String[] args) {

        System.out.println(5 - 3); // subtraction only using values

        // Subtraction using only variables
        int x = 55;
        int y = 33;
        System.out.println(x - y);

        int result = x - y;
        System.out.println(result);

        //subtraction using variable and value
        System.out.println(result - 5);

        // put "-" in the beginning of a variable, you'll get a negative result
        System.out.println(-result);

        System.out.println("result: " + x+y); // here is no math happened, cuz it's a string


    }
}
