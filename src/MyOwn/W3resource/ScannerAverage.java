package MyOwn.W3resource;

import java.util.Scanner;

public class ScannerAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();


        System.out.println("Average of the numbers: " + (num1 + num2 + num3)/3);



    }



}
