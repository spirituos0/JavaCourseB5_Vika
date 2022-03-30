package _01_JAVA.B_PrimitiveTypes;

public class ByteDataType {

    public static void main(String[] args) {


        /* int age = 30; - we don't have to use to store someone's age
        byte = 1 = [-128, 127]
        */
        byte age = 30;
        // age most probably won't be more than 127 (watch range)

        byte myFirstByte = 54;
        byte mySecondByte = -20;
        System.out.println(myFirstByte);
        System.out.println(mySecondByte);

        /* byte maxValue = 128;
        in this case 128 is out of range and max is 127
        it is confusing for Java */

        byte maxValue = 127;
        // now it is correct

        byte minValue = -128;
        // less than -128 will be an error

        System.out.println(maxValue);
        System.out.println(minValue);



    }
}
