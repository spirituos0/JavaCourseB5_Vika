package MyOwn.W3resource;

import java.util.Scanner;

public class ScannerTask1 {
    // Write a Java program that takes two numbers as input and display the product of two numbers.
    public static void main(String[] args) {

        Scanner task1 = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = task1.nextInt(); // nextInt Reads an int value from the user

        System.out.println("Input second number: ");
        int num2 = task1.nextInt();

        // I provided inputs for two random numbers and then
        // I provided a math expression which will read and count it basing on the provided values
        System.out.println(num1 + "x" + num2 + "=" + num1 * num2);



    }
}
