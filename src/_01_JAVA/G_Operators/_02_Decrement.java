package _01_JAVA.G_Operators;

public class _02_Decrement {
    public static void main(String[] args) {

        // decrement - decrease the value by 1
        int x = 5;
        --x; // or either x--
        System.out.println(x); // result: 4

        int y = 10;
        System.out.println(--y); // result: 9

        int c = 15;
        System.out.println(c--); // result: still 15
        System.out.println(c); // result: 14

        int t = 10;
        System.out.println(++t); // result: 11

        int n = 20;
        System.out.println(n++); // 20, but then increment by 1
        System.out.println(n);

    }

}
