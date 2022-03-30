package MyOwn.W3resource;

import java.util.Scanner;

public class ScannerTaskIncrement {
    public static void main(String[] args) {

        Scanner task3 = new Scanner(System.in);

        System.out.println("Input a number: ");
        int randomN = task3.nextInt();

        for (int i = 0; i<10; i++) {
            /* requirements:
            i is equal 0 but less than 10! because of:
            later I say i++, which means it will start counting it from 1 (i=0) doesn't count
            since requirement is not to exceed 10,
            i will never become 10 itself, but the i++ action makes it 10
            i++ makes it getting bigger by 1 each time
             */

            System.out.println(randomN + " x " + (i+1) + " = " + (randomN * (i+1)));
            // in sout we put (i+1), which doesn't let it multiply by 0 in the very beginning

        }
    }
}
