package _01_JAVA.C_StringMethods;

public class _15_Trim {

    public static void main(String[] args) {

        String myString = "             Hello World           ";
        // Trim method is gonna remove these ugly spaces before and after string
        // it's not gonna touch the space between Words

        System.out.println(myString); // original
        System.out.println(myString.trim()); // trimmed




    }
}
