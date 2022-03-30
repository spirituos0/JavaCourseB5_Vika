package _01_JAVA.W_Exceptions;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        String input = scanner.nextLine();

        // handle exception in this code
        // and print following message: "Your input is invalid"
        try {

            int number = Integer.parseInt(input);
            System.out.println(number);

        }
        catch (NumberFormatException ex) {

            System.out.println("Your input is invalid");

            // getMessage() will print what exactly I did and what was the cause for the exception
//            System.out.println("Your input is invalid : " +  ex.getMessage());

            // If I wanna see the exception even after catching it
            // AND track it to see where exactly was a mistake, I use printStackTrace() method
//            ex.printStackTrace();
        }

    }
}
