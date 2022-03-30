package _01_JAVA.K_If;

import java.util.Scanner;

public class Task3IfScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Integer: ");
        int userInteger = sc.nextInt();

        if (userInteger > 0) {
            System.out.print("POSITIVE"); }
        if (userInteger == 0) {
            System.out.print("ZERO"); }
        if (userInteger < 0) {
            System.out.print("NEGATIVE");
        }
    }
}
