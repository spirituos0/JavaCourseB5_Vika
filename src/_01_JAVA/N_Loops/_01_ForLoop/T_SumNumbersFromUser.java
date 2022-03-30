package _01_JAVA.N_Loops._01_ForLoop;

import java.util.Scanner;

public class T_SumNumbersFromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your limit: ");
        int limit = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= limit; i++) {
            sum += i;
        }
        System.out.println(sum); // it sums all the numbers from 0 to the limit user asks for
    }
}
