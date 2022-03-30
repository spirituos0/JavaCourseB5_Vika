package _01_JAVA.J_MathClass;

public class MathClass {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println(Math.abs(c)); // when we have negative value, result is absolute value (+)

        System.out.println(Math.max(a, b)); // returns the greatest value. Result: 2
        System.out.println(Math.min(a, b)); // returns the smallest value. Result: 1

        // round: round direction is automatic - nearest.
        // Returns int
        System.out.println(Math.round(3.4)); // result: 3
        System.out.println(Math.round(3.5)); // result: 4
        System.out.println(Math.round(3.6)); // result: 4

        // ceil: round to the near bigger number. round direction is always up
        // Returns double
        System.out.println((int)Math.ceil(7.01)); // 8
        System.out.println(Math.ceil(7.3)); // 8.0
        System.out.println(Math.ceil(7.9)); // 8.0

        // floor: round to the near smaller number. direction is always down
        // returns double
        System.out.println((int) Math.floor(5.9)); // 5
        System.out.println(Math.floor(5.1)); // 5.0
        System.out.println(Math.floor(5.999)); // 5.0

        // square root. Returns double
        System.out.println((int)Math.sqrt(16)); // 4
        System.out.println(Math.pow(2, 4)); // 16 = 2*2*2*2
        System.out.println(Math.pow(3, 4)); // 81 = 3*3*3*3

        // random from 0 to 1 ONLY. 0 is included, 1 is excluded
        System.out.println("Random double between 0 and 1: " + Math.random()); // return random double between 0-1
        // 0<----------->1

        System.out.println(Math.random() * 100); // we can put any number instead of 100 to manipulate the range
        // 0<------------>100
        System.out.println((int) Math.random() * 100); // returns 0 only




    }
}
