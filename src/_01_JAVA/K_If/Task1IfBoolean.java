package _01_JAVA.K_If;

import java.util.Scanner;

public class Task1IfBoolean {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String userString = sc.nextLine();

        // 1.
        boolean containsA = userString.contains("a");
        boolean containsB = userString.contains("b");
        boolean containsAAndaB = containsA && containsB;

        if (containsAAndaB) {
            System.out.print("String contains A and B: " + containsAAndaB);
        }

        // 2.
        boolean containsC = userString.contains("c");
        boolean containsAorC = containsA || containsC;

        if (containsAorC) {
            System.out.print("String contains A or C: " + containsAorC);
        }

        // 3.
        boolean doesNotContainC = !containsC;

        if (doesNotContainC) {
            System.out.print("String does not contain C: " + doesNotContainC);
        }

        // 4.
        boolean containsD = userString.contains("d");
        boolean doesNotContainCAndD = !containsC && !containsD;

        if (doesNotContainCAndD) {
            System.out.print("String does not contain both C and D: " + doesNotContainCAndD);
        }



    }
}
