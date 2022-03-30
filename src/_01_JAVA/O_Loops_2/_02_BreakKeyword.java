package _01_JAVA.O_Loops_2;

import java.util.Scanner;

public class _02_BreakKeyword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;

        while (true) {
            System.out.print("Enter input: ");
            userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("stop")) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            if (i == 5) // since this condition is after print, we will get 5

                break;
        }
    }
}
