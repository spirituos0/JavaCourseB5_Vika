package _01_JAVA.G_Operators;

public class _05_ComparisonOperators {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 2;

        // Equality operator:
        System.out.println(a == b); // == is checking, comparing, if they are equal? . boolean
        System.out.println(a == c);

        // Inequality Operator
        System.out.println(a != b); // checks, if they are NOT equal? boolean
        System.out.println(a != c);

        // Greater than:
        System.out.println(c > a);
        System.out.println(b > a);

        // Smaller than
        System.out.println(a < c);
        System.out.println(a < b);

        // Greater than or equal
        System.out.println(a >= a);
        System.out.println(a >= b);

        // Smaller than or equal
        System.out.println(a <= c);
        System.out.println(a <= b);

        boolean aIsLessThanC = a < c;
        System.out.println(aIsLessThanC);




    }
}
