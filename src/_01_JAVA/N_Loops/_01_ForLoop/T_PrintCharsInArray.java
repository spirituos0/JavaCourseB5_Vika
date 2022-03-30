package _01_JAVA.N_Loops._01_ForLoop;

import java.util.Scanner;

public class T_PrintCharsInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String userString = sc.nextLine();

        for (int i = 0; i < userString.length(); i++) {
            System.out.println(userString.charAt(i));
        }

    }
}
