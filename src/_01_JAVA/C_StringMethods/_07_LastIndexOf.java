package _01_JAVA.C_StringMethods;

public class _07_LastIndexOf {

    public static void main(String[] args) {

        String message = "Hello Techno Study";

        int indexOfFirstSpace = message.indexOf(' ');
        System.out.println(indexOfFirstSpace);

        int indexOfLastSpace = message.lastIndexOf(' ');
        System.out.println(indexOfLastSpace);

    }
}
