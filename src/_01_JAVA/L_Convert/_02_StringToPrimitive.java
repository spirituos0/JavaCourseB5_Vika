package _01_JAVA.L_Convert;

public class _02_StringToPrimitive {

    public static void main(String[] args) {

        String number1 = "12345";
        String number2 = "50";

        System.out.println(number1 + number2); // here is NO math

        int number1ConvertedToInt = Integer.parseInt(number1); // converting String to an integer
        int number2ConvertedToInt = Integer.parseInt(number2);

        System.out.println(number1ConvertedToInt + number2ConvertedToInt); // math happens here

        String number3 = "5";
        byte number3ConvertedToByte = Byte.parseByte(number3); // converting String into a byte

    }
}
