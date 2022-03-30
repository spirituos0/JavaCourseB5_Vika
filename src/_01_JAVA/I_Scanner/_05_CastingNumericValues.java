package _01_JAVA.I_Scanner;

import java.util.Scanner;

public class _05_CastingNumericValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your int: ");
        int userInput = (int) scanner.nextLong(); // this long is converted into integer

        System.out.println("MyInt: " + userInput);
    }
}
