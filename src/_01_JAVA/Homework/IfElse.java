package _01_JAVA.Homework;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("1) Enter 2 doubles: ");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();

        if (double1 > double2) {
            System.out.println("Double 1 is greater, than Double 2");
        } else if (double1 < double2) {
            System.out.println("Double 1 is smaller, than Double 2");
        } else {
            System.out.println("Your doubles are equal");
        }

        // 2
        System.out.print("2) Enter 2 integers: ");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();

        if (int1 > int2) {
            System.out.println("Integer 1 is greater, than Integer 2");
        } else if (int1 < int2) {
            System.out.println("Integer 1 is smaller, than Integer 2");
        } else {
            System.out.println("Your integers are equal");
        }

        // 3
        System.out.print("3) Enter two Strings.\n1: ");
        String str1 = sc.nextLine();
        sc.nextLine();

        System.out.print("2: ");
        String str2 = sc.nextLine();


        boolean equals = str1.equals(str2);

        if (equals) {
            System.out.println("String 1 is equal to String 2");
        } else {
            System.out.println("String 1 is NOT equal to String 2");
        }

        // 4
        System.out.print("4) Enter your integer: ");
        int userInt = sc.nextInt();

        if (userInt > 0) {
            System.out.println("I am positive");
        } else if (userInt < 0) {
            System.out.println("I am negative");
        } else if (userInt == 0) {
            System.out.println("I am neutral");
        }

        // 5
        System.out.println("5) Enter your double: ");
        double userDouble = sc.nextDouble();

        if (userDouble % 5 == 0 && userDouble % 8 == 0) {
            System.out.println("Your double is divisible by 5 AND by 8");
        } else if (userDouble % 3 == 0 || userDouble % 7 == 0) {
            System.out.println("Your double is divisible by 3 OR by 7");
        }

        // 6
        System.out.println("6) Enter your string: ");
        String userString = sc.nextLine();

        if (userString.contains("€")) {
            System.out.println("This is Euro");
        } else if (userString.contains("$")) {
            System.out.println("This is Dollar");
        } else {
            System.out.println("No currency");
        }

        // 7
        System.out.println("7) Enter any fruits: ");
        String fruit = sc.nextLine();

        if (fruit.contains("Orange") && fruit.length() == 6) {
            System.out.println("Orange has six letters");
        } else if (fruit.contains("Apple") && fruit.length() == 5) {
            System.out.println("Apple has five letters");
        } else if (fruit.contains("Orange") && fruit.length() > 10) {
            System.out.println("String contains 'Orange' and length of the String is more, than 10");
        }

        // 8
        System.out.println("8) Enter you integer: ");
        int userRemainder = sc.nextInt();
        boolean userEven = userRemainder % 2 == 0;

        if (userEven) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("Your number is ODD");
        }

        // 9
        System.out.println("9) Enter your integer: ");
        int userInt1 = sc.nextInt();
        int dividedBy4 = userInt1 % 4;

        if (dividedBy4 == 3) {
            System.out.println("Remainder is 3");
        } else if (dividedBy4 == 2) {
            System.out.println("Remainder is 2");
        } else if (dividedBy4 == 1) {
            System.out.println("Remainder is 1");
        } else {
            System.out.println("Remainder is 0");
        }

        // 10
        System.out.println("10) Enter 2 doubles: ");
        double userNum1 = sc.nextDouble();
        double userNum2 = sc.nextDouble();

        if (userNum1 > userNum2) {
            System.out.println("Hello World");
        } else if (userNum1 < userNum2) {
            System.out.println("Not Hello World");
        } else {
            System.out.println("I love Java");
        }
    }
}
