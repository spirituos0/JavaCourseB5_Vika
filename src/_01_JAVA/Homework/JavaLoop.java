package _01_JAVA.Homework;

import java.util.Scanner;

public class JavaLoop {

    public static void main(String[] args) {

        // 1 Multiplication
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Enter your Integer: ");
        int userInt = sc.nextInt();

        int product = 1; // I should initialize it with 1, not 0. Otherwise, it doesn't work properly
        for (int i = 1; i <= userInt; i++) {
            product = product * i;
        }
        System.out.println("Factorial of " + userInt + " is " + product);

        // 2 Even numbers
        System.out.println("2. Even numbers from 0 to 100: ");
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // 3 Odd
        System.out.println("3. Odd numbers from 0 to 100: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

        // 4 Odd reverse
        System.out.println("4. Odd numbers from 0 to 100 in Reverse order: ");
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

        // 5 Addition of natural numbers
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("5. Sum of first 10 natural numbers is: " + sum);

        // 6 all numbers, BUT...
        System.out.print("6. ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("This number is even and number is: " + i);
            }
            else {
                System.out.println("This number is odd and number is: " + i);
            }
        }

        // 7 Divisible by
        System.out.println("7. These numbers are divisible by 4 and by 5: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }

        // 8 Reverse String

//        System.out.print("8. Enter your string: ");
//        String userString = sc.nextLine();
//        sc.nextLine();
//        String reversedString = "";
//
//        for (int i = userString.length()-1; i >= 0; i--) {
//            reversedString = reversedString + (userString.charAt(i));
//        }
//        System.out.print("Reversed string of " + userString + " is ");
//        System.out.println(reversedString);

        Scanner scanner = new Scanner(System.in);
        System.out.print("8. Please enter your string: ");
        String reverse = scanner.nextLine();

        for (int i = reverse.length() - 1; i >= 0; i-- ) {
            System.out.print(reverse.charAt(i));
        }

        // 9 multiplication for user number
        System.out.print("\n9. Enter your number: ");
        int userInteger = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiply = userInteger * i;
            System.out.println(userInteger + " x " + i + " = " + multiply);
        }
    }
}
