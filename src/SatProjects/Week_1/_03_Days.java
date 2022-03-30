package SatProjects.Week_1;

import java.util.Scanner;

public class _03_Days {
    /*
        Given an int  ,
            if the int is 1 print monday
            if the int is 2 print tuesday
            if the int is 3 print wednesday
            if the int is 4 print thursday
            if the int is 5 print friday
            if the int is 6 print saturday
            if the int is 7 print sunday
            if the number is bigger than or equal to 8 or less than 1 then print "this is not a valid day"

            NOTE : USE A SWITCH STATEMENT
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your integer from 1 to 7: ");
        int userInt = sc.nextInt();
        String day;

        switch (userInt) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day";
        }
        System.out.println(day);
    }
}
