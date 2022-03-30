package _01_JAVA.O_Loops_2;

import java.util.Scanner;

public class Task2_Break {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String userString = sc.nextLine();

        char letter; // better to declare any primitive type outside and initialize it later

        for (int i = 0; i < userString.length(); i++) {
            letter = userString.charAt(i);

            if (letter == ' ')
                break;

            System.out.println(userString.charAt(i));
        }
    }
}
