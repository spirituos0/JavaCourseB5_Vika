package _01_JAVA.C_StringMethods.StringMethodsTasks;

public class Task4 {

    public static void main(String[] args) {

        String message = "Hello, how are you?";

        boolean isThisAQuestion = message.endsWith("?");
        System.out.println("Does the message end up with '?': " + isThisAQuestion);

    }
}
