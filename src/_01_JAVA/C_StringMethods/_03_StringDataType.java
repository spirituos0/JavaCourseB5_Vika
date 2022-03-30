package _01_JAVA.C_StringMethods;

public class _03_StringDataType {

    public static void main(String[] args) {

        // all the texts are string value

        String message = "Hello World";
        // String message = new String("Hello World");
        // supposed to be like this

        System.out.println(message);
        // - short way to create a string variable

        System.out.println("message");
        // - mistake, it prints string value instead of "Hello World"

        String schoolName = "TechnoStudy" + "!!";
        String courseName = "SDET course";

        System.out.println(schoolName + " " + courseName);


        String question = "What is your name?";
        String answer = "My name is: ";
        String name = "Halit";

        System.out.println(question + "\n" + answer + name);
        // \n - new line
    }
}
