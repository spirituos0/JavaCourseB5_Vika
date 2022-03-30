package _01_JAVA.C_StringMethods.StringMethodsTasks;

public class Task3Contains {

    public static void main(String[] args) {

        String hello = "Hello Techno Study!";

        // if the string is empty
        boolean isStringEmpty = hello.isEmpty();
        System.out.println("String is empty: " + isStringEmpty);

        // if it contains space
        boolean containsSpace = hello.contains(" ");
        System.out.println("String contains space: " + containsSpace);



    }

}
