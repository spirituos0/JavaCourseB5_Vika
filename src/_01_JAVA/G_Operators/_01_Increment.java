package _01_JAVA.G_Operators;

public class _01_Increment {

    public static void main(String[] args) {

        int x = 1;
        /* x = x + 1; incrementing x value by 1 */

        x++; // ++ increment operator. exactly same action as one above line 8
        System.out.println(x);


        int y = 1;
        int z = y++; // z = y + 1 and z=y=1  post increment
        System.out.println("z: " + z); // z=1
        System.out.println("y: " + y); // y=2

        int a = 1;
        int b = ++a; // pre-increment
        System.out.println(a); // a=2
        System.out.println(b); // b=2

        int f = 1;
        System.out.println(f); // the result will be 1
        System.out.println(f++); //  will print 1, then increase value of f by 1
        System.out.println(f); // the result will be 2

        int p = 5;
        System.out.println(++p); // result: p=6, incrementing occurs right here ans shows in the result
        System.out.println(p++); // result is STILL 6, then increment p by 1
        System.out.println(p); // result is already 7

        int r = 5;
        r++; // or ++r - here it doesn't matter
        System.out.println(r); // result: 6



    }
}
