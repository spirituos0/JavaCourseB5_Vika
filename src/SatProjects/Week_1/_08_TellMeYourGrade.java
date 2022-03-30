package SatProjects.Week_1;

import java.util.Scanner;

public class _08_TellMeYourGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String grade = scanner.nextLine();

        if (grade.equalsIgnoreCase("A")) {
            System.out.print("Enter your average: ");
            int average = scanner.nextInt();
                if (average > 90) {
                    System.out.println("Congrats!");
                } else {
                    System.out.println("Invalid average");
                }
        }
        if (grade.equalsIgnoreCase("B")) {
            System.out.println("You are good!");
        }
        else {
            System.out.println("You need to work hard");
        }

    }
}
 /*
    Given a String (grade)

    if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"

    if grade is "B" print "You're good"

    else (meaning if not "A" or "B") print "You need to work hard"
     */
