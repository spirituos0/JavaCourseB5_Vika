package SatProjects.Week_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DONE_03_ReverseArr {
     /*
        Given a String array (called myArray)
        Reverse the order of the elements of the String array
        Print the reversed array
        NOTE: While printing the array, don't use for loop
        Use Arrays.toString(your_array_name);
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] myArray = myStr.split(" ");

//        Your code starts here,ignore the above codes it is related to test class.
//        Use myArray

        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array: " + Arrays.asList(myArray));
    }
}

//        System.out.println(Arrays.toString(myArray));

//        // while loop:
//        int counter = myArray.length - 1; // counter index
//        while(counter >= 0) {
//            counter--;
//            System.out.println(myArray[counter]);
//
//        }
