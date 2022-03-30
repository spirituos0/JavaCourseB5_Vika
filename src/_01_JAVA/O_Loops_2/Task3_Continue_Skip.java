package _01_JAVA.O_Loops_2;

import java.util.Scanner;

public class Task3_Continue_Skip {

    public static void main(String[] args) {

        // skip even numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int userNum = sc.nextInt();

        for (int i = 0; i <= userNum; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}
