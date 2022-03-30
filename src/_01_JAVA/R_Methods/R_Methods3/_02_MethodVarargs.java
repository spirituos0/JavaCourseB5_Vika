package _01_JAVA.R_Methods.R_Methods3;

public class _02_MethodVarargs {

    public static void main(String[] args) {

        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        sum(5, 10);
//        sum(1, 2);
//        sum(1, 2, 3, 4);

    }

    public static int sum(int... varargs) { // '...' stands for variable arguments
        // now I can provide as many integers, as I want

//      int [] varargs = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < varargs.length; i++)
            sum += varargs[i];

        return sum;

    }




//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }


}
