package _01_JAVA.I_Scanner;

import java.util.Scanner;

public class _01_UserInput {
    public static void main(String[] args) {

        /* String str = "Hello!";
        System.out.println(str);

        int number = 5;
        System.out.println(number); */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte userInput = scanner.nextByte();
        System.out.println("Your age: " + userInput);



    }
}
