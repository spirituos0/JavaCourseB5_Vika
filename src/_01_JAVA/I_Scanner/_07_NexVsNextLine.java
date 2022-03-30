package _01_JAVA.I_Scanner;

import java.util.Scanner;

public class _07_NexVsNextLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        // next() only can read the first word
        // nextLine() can read the whole line
        // trim() trims the spaces, that you might pui into the input

        System.out.println("Your name: " + name);
    }

}
