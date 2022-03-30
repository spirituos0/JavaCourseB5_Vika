package _01_JAVA.C_StringMethods.StringMethodsTasks;

public class Task2 {

    public static void main(String[] args) {

        String numbers = "0.12345678";
        // part 1
        int indexOf4 = numbers.indexOf("4");
        System.out.println("Index of 4 is: " + indexOf4);

        // part 2
        int indexOfDot = numbers.indexOf(".");
        System.out.println("Index of 'dot' is: " + indexOfDot);


    }
}
