package _01_JAVA.H_TypeCasting;

public class ExplicitCasting {

    public static void main(String[] args) {

        // Explicit Casting - converting manually

        long myLong = 390432L; // this value is small enough to convert in into an integer without losing data
        int myInt = (int) myLong; // (int) helps Java to understand, that I want to convert it into an integer
        System.out.println(myInt);

        int myInteger = 555;
        short myShort = (short) myInteger;
        System.out.println(myInt);

        short myShort2 = 28;
        byte myByte = (byte) myShort2;
        System.out.println(myByte);

        double myDouble = 3.5;
        byte myByte2 = (byte) myDouble;
        System.out.println(myByte2);




    }
}
