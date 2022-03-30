package _01_JAVA.I_Scanner;

import java.util.Scanner;

public class ScannerTask1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide an integer1: ");
        int userInt1 = scanner.nextInt();

        System.out.print("Provide an integer2: ");
        int userInt2 = scanner.nextInt();

        int sum = (userInt1 + userInt2);
        System.out.println("Summary of two integers: " + sum);



    }
}
