package _01_JAVA.L_Convert;

import java.util.Scanner;

public class Task4ConvertStringIntoInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        String num1 = sc.nextLine();
        int num1int = Integer.parseInt(num1);

        System.out.print("Enter number 2: ");
        String num2 = sc.nextLine();
        int num2int = Integer.parseInt(num2);

        int sum = num1int + num2int;
        System.out.println("Sum: " + sum);
    }
}
