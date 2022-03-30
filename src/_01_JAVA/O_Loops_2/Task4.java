package _01_JAVA.O_Loops_2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String userString = sc.nextLine();

        char symbol;

        for (int i = 0; i < userString.length(); i++) {
            symbol = userString.charAt(i);
            if ((symbol == ' ') || (symbol == ';'))
                continue;
            System.out.println(symbol);
        }
    }
}
