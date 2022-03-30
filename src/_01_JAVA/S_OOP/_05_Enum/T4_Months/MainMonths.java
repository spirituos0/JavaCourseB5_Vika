package _01_JAVA.S_OOP._05_Enum.T4_Months;

import java.util.Scanner;

public class MainMonths {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().toUpperCase();

        Months userMonth = Months.valueOf(userInput);

        Months.valueOf("JUNE"); // = Months.JUNE

        switch (userMonth) {

            case JANUARY: // instead of JANUARY we also can use short name like "Jan"
                System.out.println("It is winter break!");
                break;
            case APRIL:
                System.out.println("I just finished SDET course");
                break;
            case OCTOBER:
                System.out.println("I got my first SDET job and I'm working in a great company");
                break;
            default:
                System.out.println("I'm learning Java! Please do not disturb!");
        }
    }
}
