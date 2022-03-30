package _01_JAVA.O_Loops_2;

import java.util.Scanner;

public class Task1_Break {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int userNum = sc.nextInt();

        for (int i = 0; i <= userNum; i++) {
            if (i > 10) { // if I make it > than 10, it would print 11 too.
                break;
            }
                System.out.println(i);
        }
    }
}
