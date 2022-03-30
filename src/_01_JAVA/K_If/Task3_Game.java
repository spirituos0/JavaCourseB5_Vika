package _01_JAVA.K_If;

import java.util.Scanner;

public class Task3_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from 0 to 5: ");
        int userInt = sc.nextInt();

        int randomNumber = (int) (Math.random() * 6); // 6 because 5 is included. 6 is not included
        System.out.print("Random number: " + randomNumber + '\n');


        if (userInt <= 5 && randomNumber >= 0) {
            if (userInt == randomNumber) {
                System.out.println("YOU WON!");
            } else {
                System.out.println("YOU LOST!");
            }
        } else {
            System.out.println("INVALID NUMBER");

        }


    }


}
