package SatProjects.Week_2;

import java.util.Arrays;
import java.util.Scanner;

public class DONE_09_ChangeArray {

     /*
        Given one array of Strings
        If this string array contains "Orange" change all "Orange" to "Apple"
        Print the Array

        Sample:
        Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your fruit string: ");
        String myStr = scan.nextLine();
        String[] fruitArray = myStr.split(" ");

//        Code starts here
//        You should use fruitArray (given above)

        String replacedOrange;
        String fruitArray2 = Arrays.toString(fruitArray);
        boolean containsOrange = fruitArray2.contains("Orange");

        if (containsOrange) {
            replacedOrange = fruitArray2.replaceAll("Orange", "Apple");
            System.out.println("Replaced 'orange': " + replacedOrange);
        } else {
            System.out.println(fruitArray2);
        }
    }
}
