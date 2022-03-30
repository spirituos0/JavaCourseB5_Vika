package _01_JAVA.K_If;

import java.util.Scanner;

public class Task1IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = sc.nextInt();

        if (userNumber > 100) {
            System.out.println("It's bigger than 100");
        } else {
            System.out.println("Number is less than or equal to 100");
        }


    }


}
