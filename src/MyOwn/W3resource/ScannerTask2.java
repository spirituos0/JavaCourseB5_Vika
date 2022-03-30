package MyOwn.W3resource;

import java.util.Scanner;

public class ScannerTask2 {
    public static void main(String[] args) {

        Scanner task2 = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = task2.nextInt();

        System.out.println("input second number: ");
        int num2 = task2.nextInt();

        // parentheses are important! otherwise, we get wrong answer
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println("Multiplication: " + num1 + " x " + num2 + " = " + (num1*num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println("Modulus: " + num1 + " mod " + num2 + " = " + (num1%num2));


    }
}
