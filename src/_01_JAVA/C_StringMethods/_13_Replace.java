package _01_JAVA.C_StringMethods;

public class _13_Replace {

    public static void main(String[] args) {

        // in Replace method we replace ONE word or symbol
        String myString = "Hello World!";

        String replacedString = myString.replace('l', '$');
        System.out.println(replacedString);

        String replacedWithHi = myString.replace("Hello", "hi");
        System.out.println(replacedWithHi);

        System.out.println(myString);



    }
}
