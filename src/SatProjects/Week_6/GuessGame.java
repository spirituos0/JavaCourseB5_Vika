package SatProjects.Week_6;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        GuessGame game = new GuessGame();
        game.letsGuess(34);

    }

    Scanner sc = new Scanner(System.in);

    public void letsGuess(int secretNumber) {

        int attempts = 5;

        int userNum = 0;

        System.out.print("Guess number between 0 and 100 (inclusive): ");

        for (int i = 0; i < attempts; i++) {

            userNum = sc.nextInt();
//            String userInput = Integer.toString(userNum);
//            boolean notALetter = userInput.matches("[0-9]+");

//            try {
//                userNum = sc.nextInt();
//            } catch (InputMismatchException ex) {
//                System.out.println("Don't use letters or symbols. Enter the number: ");
//            } catch (IOException ex) {
//                System.out.println("Don't use letters or symbols. Enter the number: ");
//            }

            if (userNum == secretNumber) {
                System.out.println("You won. Congrats!");
                break;
            }
            else if ((userNum < 0 || userNum > 100) && i < attempts-1)
                System.out.print("Invalid number. Try again: ");
            else if ((userNum < secretNumber) && i < attempts-1)
                System.out.print("Your number is too small. Try bigger number: ");
            else if ((userNum > secretNumber) && i < attempts-1)
                System.out.print("Your number is too big. Try smaller number: ");
            else
                System.out.print("You lost! Better chance next time.");


        }
    }
}
