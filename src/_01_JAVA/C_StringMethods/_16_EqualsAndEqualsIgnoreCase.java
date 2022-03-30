package _01_JAVA.C_StringMethods;

public class _16_EqualsAndEqualsIgnoreCase { // 2 methods

    public static void main(String[] args) {

        String string1 = "TechnoStudy";
        String string2 = "TechnoStudy";
        String string3 = "TECHNOSTUDY";

        // equal
        System.out.println("Is string1 equal to string2: " + string1.equals(string2));

        System.out.println("Is string1 equal to string3: " + string1.equals(string3));

        // equalsIgnoreCase
        System.out.println("Is String1 equalsIgnoreCase to String3: " + string1.equalsIgnoreCase(string3));
        // it does not care about cases (upper or lower)




    }

}
