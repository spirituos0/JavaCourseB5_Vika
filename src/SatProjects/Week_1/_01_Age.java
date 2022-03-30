package SatProjects.Week_1;

import java.util.Scanner;

public class _01_Age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        if (userAge <= 10) {
            System.out.println("You are too young to create a Facebook account");
        }
        if (userAge <= 16) {
            System.out.println("You are too young to get a driver's license");
        }
        if (userAge <= 18) {
            System.out.println("You are too young to get a tattoo");
        }
        if (userAge <= 21) {
            System.out.println("You are too young to drink alcohol");
        } else {
            System.out.println("You are eligible drink alcohol in the US");
        }

    }
}

