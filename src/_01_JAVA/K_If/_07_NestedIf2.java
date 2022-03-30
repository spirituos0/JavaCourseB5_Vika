package _01_JAVA.K_If;

import java.util.Scanner;

public class _07_NestedIf2 {
    public static void main(String[] args) {

        //Basic nested if-->if inside if
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a Student at Techno Study?: ");
        boolean iAmStudentAtTechnoStudy = scanner.nextBoolean();
        boolean batch5;

        if (iAmStudentAtTechnoStudy) {
            System.out.print("Are you a Student of BATCH5?: ");
            batch5 = scanner.nextBoolean();

            if (batch5){
                System.out.println("Welcome!");
            } else {
                System.out.println("You are not student of the Batch5");
            }
        } else {
            System.out.println("You cannot enter to the campus");
        }
    }
}
