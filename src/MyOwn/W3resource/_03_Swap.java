package MyOwn.W3resource;

public class _03_Swap {
    public static void main(String[] args) {

        // swapping - interchanging of values of variables

        // 1 solution
        int a, b, temp; // temp - temporary variable
        a = 15;
        b = 27;
        System.out.println("Before swapping: a, b = " + a + ", " + b);

        temp = a; // we created temporary variable, which will keep the 'a' value 15. a=15 still, temp=15
        a = b; // a assigns to b and changes to 27. now a=27
        b = temp; // and since we kept temp assigned to the 'a' value 15, temp=15 and b=temp=15
        System.out.println("After swapping: a, b = " + a + ", " + b);

        // 2 solution
        int a2 = 15;
        int b2 = 27;

        a2 = a2 + b2; // a = 42
        b2 = a2 - b2; // b = 42-27 = 15
        a2 = a2 - b2; // a = 42-15 = 27

        System.out.println("a: " + a2);
        System.out.println("b: " + b2);

        // 3 solution. binary numbers (google for the
        int a3 = 15; // 15 = 1111
        int b3 = 27; // 27 = 11011

        // ^ -> XOR   1 1 -> 0  ;  1 0 -> 1  ;  0 0 -> 0  ;  0 1 -> 1
        a3 = a3 ^ b3; // 1111 XOR 11011 -> 00101
        b3 = a3 ^ b3;
        a3 = a3 ^ b3;

        System.out.println("a: " + a3);
        System.out.println("b: " + b3);




    }

}
