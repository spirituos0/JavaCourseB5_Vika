package _01_JAVA.B_PrimitiveTypes;

public class LongDataType {

    public static void main(String[] args) {

        /* ex: long worldPopulation = 7_800_000_000;
        by default numbers are Integer in Java,
        that's why it shows error here.
        We need to put L in the end to say Java this is long: */
        long worldPopulation = 7_800_000_000L;
        System.out.println(worldPopulation);

        long myFirstLong = 76_321_844_921L;
        long mySecondLong = -10_087_654_325_326L;
        System.out.println(myFirstLong);
        System.out.println(mySecondLong);

        long maxValue = 923_372_036_854_775_807L;
        long minValue = -923_372_036_854_775_808L;
        System.out.println(maxValue);
        System.out.println(minValue);


    }

}
