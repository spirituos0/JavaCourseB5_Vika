package _01_JAVA.I_Scanner;

import java.util.Scanner;

public class ScannerTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("What is your hometown? ");
        String hometown = sc.nextLine();

        System.out.print("How old are you? ");
        byte age = sc.nextByte();

        System.out.print("How tall are you? ");
        double height = sc.nextDouble();

        System.out.print("What is your current location? ");
        String location = sc.nextLine(); // if you have nextLine after nextInt, that's the reason of skipping
        sc.nextLine();

        System.out.print("Do you like " + location + "? Provide 'true' or 'false' ");
        boolean like = sc.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Hometown: " + hometown);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Current location: " + location);

    }
}
