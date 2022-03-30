package _01_JAVA.C_StringMethods;

public class _05_Length {

    public static void main(String[] args) {

        String longString = "asldjfhlh5lth387f8e7fa8e7f878a";

        int lengthOfLongString = longString.length();

        System.out.println("Length of the String: " + lengthOfLongString);

        String shortString = "abc   "; // spaces count

        System.out.println(shortString.length());


    }

}
