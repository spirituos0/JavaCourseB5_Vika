package _01_JAVA.K_If;

import java.util.Scanner;

public class Task2IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String userString = sc.nextLine();  // to check lower/upper cases, we should use .toLowerCase();

        if (userString.contains("a") && userString.contains("b")) {
            System.out.println("The input contains both A and B");
        }
        else if (userString.contains("a")) {
            System.out.println("The input contains A");
        }

        else if (userString.contains("b")) {
            System.out.println("The input contains B");
        }
        else {
            System.out.println("The input does not contain both A and B");
        }

    }


}
