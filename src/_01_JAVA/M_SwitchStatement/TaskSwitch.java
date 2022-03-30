package _01_JAVA.M_SwitchStatement;

import java.util.Scanner;

public class TaskSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        String grade = sc.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Well done!");
                break;
            case "C":
                System.out.println("Good!");
                break;
            case "D":
                System.out.println("Need improvement");
                break;
            case "E":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not valid");



        }
    }
}
