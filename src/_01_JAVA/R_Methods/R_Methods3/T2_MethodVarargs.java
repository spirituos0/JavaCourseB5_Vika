package _01_JAVA.R_Methods.R_Methods3;

public class T2_MethodVarargs {

    public static void main(String[] args) {


        System.out.println("Product is: " + multiply(5.6, 7.2, 8.1));

    }

    public static double multiply(double... numbers) {

        int product = 1; // if we set it to 0, it'd stay 0
        for (int i = 0; i < numbers.length; i++)
            product *= numbers[i];

        return product;
    }
}
