package SatProjects.Week_1;

import java.util.Scanner;

public class _09_TotalLetterCountCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String word = scanner.nextLine();

        int stringLength = word.length();

        if (!(stringLength % 2 == 0)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
    /*
        Given a String ,
            if the number of the characters in the given String is odd then print true else print false
     */

