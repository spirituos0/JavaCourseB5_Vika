package SatProjects.Week_1;

import java.util.Scanner;

public class FizzbuzzAfra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.

        if ((number % 5 == 0) && (number % 3 == 0)) {
            System.out.println("fizzbuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("fizz");
        }
        else if (number % 3 == 0) {
            System.out.println("buzz");
        } else if (number % 5 != 0 || number % 3 != 0) {
            System.out.println("same number: " + number);


        }

    }
}
