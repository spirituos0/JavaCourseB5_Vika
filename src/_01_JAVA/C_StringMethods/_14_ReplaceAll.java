package _01_JAVA.C_StringMethods;

public class _14_ReplaceAll {

    public static void main(String[] args) {

        // in ReplaceAll we provide range of characters. Not only one symbol or word
        String phoneNumber = "My number is 012387394567890";

        String replaceNumber = phoneNumber.replaceAll("[3-6]", "#");
        // range of numbers from 3 to 6 is going to be replaced with #
        System.out.println(replaceNumber);

        String replacedNumber2 = phoneNumber.replaceAll("[0-9]", "-");
        // range of numbers from 0 to 9 is going to be replaced with -
        System.out.println(replacedNumber2);

        System.out.println(phoneNumber.replaceAll("[a-z]", "+"));
        System.out.println(phoneNumber.replaceAll("[A-z]", "|"));
        // A B C .. X Y Z ... a b c ..x y z



    }

}
