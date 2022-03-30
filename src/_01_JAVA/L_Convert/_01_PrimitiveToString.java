package _01_JAVA.L_Convert;

public class _01_PrimitiveToString {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        byte z = 5;

        System.out.println(x + y); // addiction, 3

        // wrapper class
        String xConvertedToString = Integer.toString(x);
        String yConvertedToString = Integer.toString(y);

        System.out.println(xConvertedToString + yConvertedToString); // concat, 12

        String zConvertedToString = Byte.toString(z);

        System.out.println(xConvertedToString + zConvertedToString); // result 15


    }
}
