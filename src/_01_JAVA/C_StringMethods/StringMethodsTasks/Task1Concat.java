package _01_JAVA.C_StringMethods.StringMethodsTasks;

public class Task1Concat {

    public static void main(String[] args) {

        String first = "01234";
        String second = "56789";

        String concatWithMethod = first.concat(second);
        String concatWithPlus = first + second;

        System.out.println(concatWithMethod);
        System.out.println(concatWithPlus);

    }
}
