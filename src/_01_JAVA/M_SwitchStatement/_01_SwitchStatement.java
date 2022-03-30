package _01_JAVA.M_SwitchStatement;

import java.util.Scanner;

public class _01_SwitchStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your role number: ");
        int roleValue = sc.nextInt();

        switch (roleValue) { // switch statement only checks the equality of case below

            case 1:
                System.out.println("You are an ADMIN!");
                break; // this moves to the next case
            case 2:
                System.out.println("You are a TEACHER!");
                break;
            case 3:
                System.out.println("You are a STUDENT!");
                break;
            default:
                System.out.println("You are a GUEST!");
        }

 /*     if (roleValue == 1) {
            System.out.println("You are an ADMIN!");
        } else if (roleValue == 2) {
            System.out.println("You are a TEACHER!");
        } else if (roleValue == 3){
            System.out.println("You are a STUDENT!");
        } else {
            System.out.println("You are a GUEST!");
        } */
    }
}
