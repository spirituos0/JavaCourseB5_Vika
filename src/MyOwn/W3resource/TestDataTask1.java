package MyOwn.W3resource;

public class TestDataTask1 {
    public static void main(String[] args) {

        int a = -5 + 8 * 6;
        System.out.println(a); // 43

        int b = (55 + 9) % 9; // % modulus - remainder from a division
        System.out.println(b); // 64:9=63:9=7. Remainder is 1

        int c = 20 + -3 * 5 / 8;
        System.out.println(c); // the actual result is 18.125. but in the output we get 19

        int d = 5 + 15 / 3 * 2 - 8 % 3; // 15 - (8%3) + 15 - 2 = 13
        System.out.println(d);

        // System.out.print(a + "\n" + b + "\n" + c + "\n" + d);
    }
    }

