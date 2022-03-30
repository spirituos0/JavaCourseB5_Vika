package _01_JAVA.B_PrimitiveTypes;

public class DoubleDataType { // 15 decimals (it's gonna round up until that amount)

    public static void main(String[] args) {

        double mileage = 756.234;
        System.out.println("Mileage left to arrive Chicago: " + mileage);

        System.out.println("Max value for double: " + Double.MAX_VALUE);
        System.out.println("Min value for double: " + Double.MIN_VALUE);

        double price = 5;
        System.out.println(price);
        // Because we are talking about price, it shows as 5.0
        // 5 = 5.0 = 5.000000


    }
}
