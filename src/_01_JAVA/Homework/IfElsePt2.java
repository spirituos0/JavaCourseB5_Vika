package _01_JAVA.Homework;

import java.text.NumberFormat;
import java.util.Scanner;

public class IfElsePt2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("1. a) Enter your Quiz score: ");
        int quiz_score = sc.nextInt();
        System.out.print("b) Mid term score: ");
        int mid_term_score = sc.nextInt();
        System.out.print("c) Enter your Final score: ");
        int final_score = sc.nextInt();

        int avgScore = (quiz_score + mid_term_score + final_score) / 3;

        if (avgScore >= 90) {
            System.out.println("Your grade is A");
        }
        else if (avgScore >= 70 && avgScore < 90) {
            System.out.println("Your grade is B");
        }
        else if (avgScore >= 50 && avgScore < 70) {
            System.out.println("Your grade is C");
        }
        else if (avgScore < 50) {
            System.out.println("Your grade is F");
        }
        else {
            System.out.println("Invalid parameters");
        }

        // 2
        System.out.println("2. Enter 3 integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

//        int[] userNums = {num1, num2, num3};
//        Arrays.sort(userNums);
//
//        System.out.println("Min value in Array: " + userNums[0]);
//        System.out.println("Max value in Array: " + userNums[userNums.length-1];

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is Max");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is Max");
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is Max");
        }

        // 3
        System.out.println("3. Enter 3 integers: ");
        int num11 = sc.nextInt();
        int num22 = sc.nextInt();
        int num33 = sc.nextInt();

        if (num11 < num22 && num11 < num33) {
            System.out.println(num11 + " is Min");
        }
        else if (num22 < num11 && num22 < num33) {
            System.out.println(num22 + " is Min");
        }
        else if (num33 < num11 && num33 < num22) {
            System.out.println(num33 + " is Min");
        }

        // 4

//        Speed Zone = 45 mi/h;

        System.out.print("4. Enter your current speed: ");
        int currentSpeed = sc.nextInt();

        System.out.print("You have a Driver's License (true or false): ");
        boolean hasDriversLicense = sc.nextBoolean();
        sc.nextLine();

        int extraCharge = 200;
        int fine;

        if (currentSpeed >= 55 && currentSpeed <= 74) {
            fine = 100;
            if (hasDriversLicense) {
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine));
            }
            if (!hasDriversLicense) {
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine + extraCharge));
            }
        }
        if (currentSpeed >= 75 && currentSpeed <= 84) {
            fine = 150;
            if (hasDriversLicense) {
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine));
            }
            if (!hasDriversLicense){
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine + extraCharge));
            }
        }
        if (currentSpeed >= 85 && currentSpeed <= 94) {
            fine = 320;
            if (hasDriversLicense) {
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine));
            }
            if (!hasDriversLicense) {
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine + extraCharge));
            }
        }
        if (currentSpeed > 94) {
            fine = 500;
            if (hasDriversLicense) {
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine));
            }
            if (!hasDriversLicense) {
                System.out.println("Your fine is " +
                        NumberFormat.getCurrencyInstance().format(fine + extraCharge));
            }
        }
    }
}

