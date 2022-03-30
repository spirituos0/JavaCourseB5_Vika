package MyOwn.W3resource;

import java.util.Scanner;

public class _01_Scanner {
    // The Scanner class is used to get user input
    // it lets me type in the output window

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine(); // in the output I can type my name

        // Numerical input
        int age = myObj.nextInt(); // output : type age
        double salary = myObj.nextDouble(); // output: type salary using only numbers, no $

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);



    }
}
