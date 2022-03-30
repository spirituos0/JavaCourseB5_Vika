package _01_JAVA.B_PrimitiveTypes;

public class IntegerDataType {

    public static void main(String[] args) {

        /* int = 4 bytes = [-2B, 2B]
        most of the cases in general we are going to use integer*/

        int youtubeViewCount = 200_000_000;
        /* in Java we use _ (underscore) instead of , (coma)
        between every 3 digit in a big number */
        System.out.println(youtubeViewCount);

        int myFirstInteger = 123456789;
        int mySecondInteger = -987654321;
        System.out.println(myFirstInteger);
        System.out.println(mySecondInteger);

        int maxValue = 2_147_483_647;
        int minValue = -2_147_483_648;
        System.out.println(maxValue);
        System.out.println(minValue);

    }

}
