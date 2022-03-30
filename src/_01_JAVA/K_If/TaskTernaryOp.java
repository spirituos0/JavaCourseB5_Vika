package _01_JAVA.K_If;

import java.util.Scanner;

public class TaskTernaryOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temperature = sc.nextInt();

        String message = temperature < 15 ? "Cold Weather" : "Good Weather";
        System.out.println(message);
    }
}
