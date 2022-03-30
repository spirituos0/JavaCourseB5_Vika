package _01_JAVA.Homework;

import java.text.NumberFormat;
import java.util.Scanner;

public class IfElseSpeed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

