package _01_JAVA.C_StringMethods;

public class _10_Contains {

    public static void main(String[] args) {

        // checks, if message contains something or not
        // returns boolean

        String hello = "Hello World";

        boolean containsH = hello.contains("H"); // case sensitive (imp H or h)
        boolean containsWorld = hello.contains("World");
        boolean containsSpace = hello.contains(" ");
        boolean containsZ = hello.contains("Z");

        System.out.println("String contains \"H\": " + containsH);
        System.out.println("String contains \"World\": " + containsWorld);
        System.out.println("String contains \"space\": " + containsSpace);
        System.out.println("String contains \"Z\": " + containsZ);


    }
}
