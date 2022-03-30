package _01_JAVA.C_StringMethods;

public class _11_Concat {

    public static void main(String[] args) {

        String first = "Hello ";
        String second = "TechnoStudy";
        String third = "!!!";

        first.concat(second);
        System.out.println(first.concat(second));

        String concattedString = first.concat(second);
        System.out.println(concattedString);

        String concattedString2 = concattedString.concat(third);
        System.out.println(concattedString2);

        String concatAll = first.concat(second.concat(third));
        System.out.println(concatAll);
        // option to combine all the strings at once

    }
}
