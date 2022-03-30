package _01_JAVA.K_If;

import java.util.Scanner;

public class TaskNestedIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temperature = sc.nextInt();

        if (temperature > 0) {
            System.out.print("Enter the Atmospheric Pressure: ");
            int pressure = sc.nextInt();
            if (pressure > 5) {
                System.out.println("OK");
            } else {
                System.out.println("Not okay");
            }
        } else if (temperature <= 0) {
            System.out.println("Too cold to check");
        }


    }
}
