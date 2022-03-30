package _01_JAVA.N_Loops._02_WhileLoop;

import java.util.Scanner;

public class _06_LoginWithDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pin = 8787;
        int userInput;

        do {
            System.out.print("Enter your pin number: ");
            userInput = sc.nextInt();
        } while (userInput != pin);
        /* while userInput is not equal to correct pin,
        ask user until he enters the correct pin.
        Otherwise, (if pin is correct) print 'you are logged in' */
        System.out.print("You are logged in");


    }
}
