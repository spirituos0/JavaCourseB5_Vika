package _01_JAVA.C_StringMethods;

public class _01_StartsWith {

    public static void main(String[] args) {

        String message = "Hello World!!";
        System.out.println(message.startsWith("Hello"));
        // result is showed as a boolean

        boolean doesMessageStartsWithHello = message.startsWith("Hello");
        System.out.println("Is the message Starts with Hello: " + doesMessageStartsWithHello);

        boolean doesSecondWordStartsWithW = message.startsWith("W", 6);
        // it skips 6 characters and goes to 'World' which starts with W
        System.out.println("Is the message Starts with W: " + doesSecondWordStartsWithW);


    }
}
