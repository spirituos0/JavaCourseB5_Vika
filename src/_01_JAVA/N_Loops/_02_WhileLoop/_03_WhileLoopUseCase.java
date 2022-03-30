package _01_JAVA.N_Loops._02_WhileLoop;

import java.util.Scanner;

public class _03_WhileLoopUseCase {

    public static void main(String[] args) {

        // get a string from user and print the string back
        // unless user types "quit", if user types quit then quit the loop

        Scanner sc = new Scanner(System.in);
        String userInput = ""; // empty string. or we can ge

        while (!userInput.equals("quit")) { // while input is NOT equal to 'quit', then...
            System.out.print("Enter the input: "); // ...print this.
            userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("quit")) { // if string is equal to 'quit'...
                break; // ...then stop it.
            } else { // ...otherwise,..
                System.out.print(userInput); // ..print this.
            }
        }
    }
}
