package _01_JAVA.B_PrimitiveTypes;

public class FloatDataType { // 6 to 7 decimals (numbers after dot) , amount it's gonna print.

    public static void main(String[] args) {

        float laptopPrice = 999.99F;
        /* by default, it is double (8 bytes),
         so we need to put F in the end, float = 4 bytes */
        System.out.println(laptopPrice);

        float negativeDecimalNumber = -79.55F;
        System.out.println(negativeDecimalNumber);

        System.out.println("Max value for float: " + Float.MAX_VALUE);
        System.out.println("Min value for float: " + Float.MIN_VALUE);


    }
}
