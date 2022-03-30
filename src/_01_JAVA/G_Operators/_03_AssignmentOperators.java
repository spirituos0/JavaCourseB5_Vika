package _01_JAVA.G_Operators;

public class _03_AssignmentOperators {
    public static void main(String[] args) {

        int x = 1; // simple assignment of a value
        int y = x; // assignment of variable X's value to y

        x = x + 4; // assigning a new value to x, old value of x plus 4
        System.out.println(x); // result: 5

        y += 4; // y = y + 4; | increase a new value of y by 4
        System.out.println(y); // result: 5

        x += 10;
        System.out.println(x); // result: 15

        int a = 10;

        a -= 5; // a = a - 5; | decrease a value by 5
        System.out.println(a);

        a -= 1; // a = a - 1; | decrease a value by 1
        System.out.println(a);

        int b = 3;

        b *= 3; // b = b * 3; | multiply b value by 3
        System.out.println(b);

        b /= 9; // b = b / 9; | divide b value by 9
        System.out.println(b);

        int p = 99;

        p %= 10; // p = remainder from division 99/10
        System.out.println(p); // result: 9
    }
}
