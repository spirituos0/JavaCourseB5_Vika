package _01_JAVA.C_StringMethods.StringMethodsTasks;

public class Task3 {

    public static void main(String[] args) {

        String hello = "Hi world,Hello world";

        // part 1: if the message starts with "Hi"
        boolean doesMessageStartWithHi = hello.startsWith("Hi");
        System.out.println("Does the message Start with Hello: " + doesMessageStartWithHi);

        // part 2: if there is 'Hello' after coma
        //we need to use toffset for skipping characters
        boolean isThereHelloAfterComma = hello.startsWith("Hello", 9);
        System.out.println("a) Is there Hello after Coma: " + isThereHelloAfterComma);

        int indexOfComma = hello.indexOf(',');
        boolean secondPartStartsWithHello2 = hello.startsWith("Hello", indexOfComma + 1);
        // another solution for the second part for avoiding counting the characters
        System.out.println("b) Is there Hello after Coma: " + secondPartStartsWithHello2);

    }
}
