package _01_JAVA.Homework;

import java.util.Scanner;

public class _03_ArithmeticExpressions {

    public static void main(String[] args) {

        // 1
        double num1a = 30;
        double num1b = 6;
        double result1 = num1a / num1b;
        System.out.println("1. " + num1a + " / " + num1b + " = " + result1);

        // 2
        int num2a = 20;
        int num2b = 4;
        int result2 = num2a / num2b;
        System.out.println("2. " + num2a + " / " + num2b + " = " + result2);

        // 3
        double num3a = 3.3;
        double num3b = 1.9;
        double num3c = 20.6;
        double result3 = num3a * num3b * num3c;
        System.out.println("3. " + num3a + " x " + num3b + " x " + num3c + " = " + result3);

        // 4
        double num4a = 2.3;
        double num4b = 4.8;
        double num4c = 10.2;
        double num4d = 1.1;
        double result4 = num4a * num4b * num4c * num4d;
        System.out.println("4. " + num4a + " x " + num4b + " x " + num4c + " x " + num4d + " = " + result4);

        // 5
        int num5a = 5;
        int num5b = 3;
        int num5c = 8;
        int num5d = 7;
        int result5 = num5a * num5b * num5c * num5d;
        System.out.println("5. " + num5a + " x " + num5b + " x " + num5c + " x " + num5d + " = " + result5);

        // 6
        int reminder6 = 10 % 3;
        System.out.println("6. Reminder or the division 10 by 3: " + reminder6);

        // 7
        int reminder7 = 22 % 4;
        System.out.println("7. Reminder of the division 22 by 4: " + reminder7);

        // 8
        int reminder8 = 35 / 11;
        System.out.println("8. Reminder of the division 35 by 11: " + reminder8);

        // 9
        int num9a = 50;
        int num9b = 10;
        int result9 = num9a - num9b;
        System.out.println("9. " + num9a + " - " + num9b + " = " + result9);

        // 10
        int num10a = 90;
        int num10b = 45;
        int num10c = 20;
        int num10d = 5;
        int result10 = num10a - num10b - num10c - num10d;
        System.out.println("10. " + num10a + " - " + num10b + " - " + num10c + " - " + num10d + " = " + result10);

        // 11
        int num11a = 12;
        int num11b = 16;
        int result11 = num11a + num11b;
        System.out.println("11. " + num11a + " + " + num11b + " = " + result11);

        // 12
        int num12a = 30;
        int num12b = 20;
        int num12c = 52;
        int num12d = 41;
        int result12 = num12a + num12b + num12c + num12d;
        System.out.println("12. " + num12a + " + " + num12b + " + " + num12c + " + " + num12d + " = " + result12);

        // 13
        int num13a = 10;
        int num13b = 20;
        int num13c = 12;
        int result13 = num13a + num13b + num13c;
        System.out.println("13. " + num13a + " + " + num13b + " + " + num13c + " = " + result13);

        // 14
        Scanner sc = new Scanner(System.in);

        System.out.print("14. Enter 4 numbers: ");
        int userNum1 = sc.nextInt();
        int userNum2 = sc.nextInt();
        int userNum3 = sc.nextInt();
        int userNum4 = sc.nextInt();

        int result14 = (userNum1 * userNum2) / (userNum3 + userNum4);
        System.out.println("(" + userNum1 + " x " + userNum2 + ")" + " / " +
                "(" + userNum3 + " + " + userNum4 + ")" + " = " + result14);

    }
}
