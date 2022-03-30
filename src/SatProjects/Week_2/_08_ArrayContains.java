package SatProjects.Week_2;

import java.util.Scanner;

public class _08_ArrayContains {
     /*
        Given two arrays of ints. Say, first array is "outer" and second array is "inner".
        Both arrays are already sorted in increasing order.
        Print true if all the numbers in the inner array also appear in the outer array.
        Otherwise, print false
        (In other words, print true if first array contains second array.)

        Samples:
        [1, 2, 4, 6], [2, 4] → true
        [1, 2, 4, 6], [2, 3, 4] → false
        [1, 2, 4, 4, 6], [2, 4] → true

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine(); // ask user to enter numbers as string with space between

        String[] arr = myStr.split(" "); // splits by space

        int[] myArr = new int[5]; // user should enter 5 numbers

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]); // converting integer into a string
            myArr[i] = num;
        }

        int[] outer = new int[3];
        int[] inner = new int[2];

        for (int i = 0; i < 3; i++) // it prints first array with 4 indexes
            outer[i] = myArr[i];

        for (int i = 3; i < 5; i++)  // it prints second array with 2 indexes
            inner[i - 3] = myArr[i];


//        Start coding here and ignore the above codes. Code above is necessary for the test class.
//        Use the arrays called outer and inner

        // Solution, which doesn't work for me:

//        String outerConvertedToString = Integer.toString(outer[i]);
//        String innerConvertedToString = Integer.toString(inner[i]);

//        if (outerConvertedToString.contains(innerConvertedToString)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

    }
}