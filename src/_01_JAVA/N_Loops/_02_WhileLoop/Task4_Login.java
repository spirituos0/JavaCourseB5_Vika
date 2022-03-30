package _01_JAVA.N_Loops._02_WhileLoop;

import java.util.Scanner;

public class Task4_Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your pin number: ");
        int pin = 8787;
        int userInput = sc.nextInt();

        while (userInput != pin) {
            System.out.print("Incorrect pin. Try again");
            userInput = sc.nextInt();
        }
        System.out.print("You are logged in");
    }
}



