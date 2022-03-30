package _01_JAVA.K_If;

import java.util.Scanner;

public class Task2IfMoreLess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Integer: ");
        int userInt = sc.nextInt();

        if (userInt > 100) {
            System.out.println("PASSED");
        }
    }
}
