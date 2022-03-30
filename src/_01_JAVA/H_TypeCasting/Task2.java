package _01_JAVA.H_TypeCasting;

public class Task2 {
    public static void main(String[] args) {

        float floatNr = 3455.6789F;
        int intNr = (int) floatNr;
        System.out.println(intNr);

        double doubleNr = 98.7654;
        float floatNr2 = (float) doubleNr;
        System.out.println(floatNr2);

        long longNr = 11L;
        byte byteNr = (byte) longNr;
        System.out.println(byteNr);

        double a = 1.5;
        int b = (int) a + 5;
        System.out.println(b);


    }
}
