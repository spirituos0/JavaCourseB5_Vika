package _01_JAVA.N_Loops._02_WhileLoop;

import java.util.Scanner;

public class Task1_WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your limit: ");
        int userLimit = sc.nextInt();

        int sum = 0; // 0 because it does not affect the sum.

        int counter = 1;

        while (counter <= userLimit) {
            sum += counter;
            counter++;
            System.out.println(sum);
        }
    }
}
