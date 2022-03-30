package _01_JAVA.H_TypeCasting;

public class ImplicitCasting {

    public static void main(String[] args) {

        // Implicit Casting (Widening Casting) - converting automatically

        // byte > short > int > long > float > double

        byte byteNumber = 50;
        short shortNumber = byteNumber; // byte is converted into short
        System.out.println(shortNumber); // result: 50

        short shortNumber2 = 400;
        int intNumber = shortNumber2; // short is converted into an integer
        System.out.println(intNumber); // result: 400

        int intNumber2 = 2000000;
        long longNumber = intNumber2;
        System.out.println(longNumber);

        float floatNumber = 1.3457F;
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);

        short shortNumber3 = 250;
        float floatNumber2 = shortNumber3;
        System.out.println(floatNumber2);

        double doubleNumber2 = 5; // 5 - integer. double would be 5.0
        // this integer is converted into a double automatically

        /* int b = doubleNumber2 + 4; NO
         -> this is not gonna work, because on the right side is a double expression.
         4 is converting into a double automatically
         but the whole expression is in int. double is not gonna get converted into integer automatically. */

        /* int b = 1.5 + 3.4
        same here. int cannot be equal to a double
         */

        double a = 2.1;
        double b = a + 5;
        System.out.println(b); // result: 7.1 - double. implicit casting



    }
}
