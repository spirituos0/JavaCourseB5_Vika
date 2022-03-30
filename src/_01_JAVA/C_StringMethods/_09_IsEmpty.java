package _01_JAVA.C_StringMethods;

public class _09_IsEmpty {

    public static void main(String[] args) {

        String name = "Halit";
        // returns boolean
        System.out.println(name.isEmpty());
        // it returns as false, because is has 5 characters in

        String emptyString = "";
        System.out.println(emptyString.isEmpty());
        // true, there is nothing, including no space

        String space = " ";
        //false - space is a character, not 'empty'
        boolean isSpaceEmpty = space.isEmpty();
        System.out.println(isSpaceEmpty);

    }
}
