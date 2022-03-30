package _01_JAVA.C_StringMethods.StringMethodsTasks;

public class Task5 {

    public static void main(String[] args) {

        // part 1: to Lower Case
        String hi = "Hello TechnoStudy!";
        String lowerCasedHi = hi.toLowerCase();
        System.out.println(lowerCasedHi);

        // part 2: to Upper Case
        // I don't need to make a new string, cuz gonna use the same one
        String upperCasedHi = hi.toUpperCase();
        System.out.println(upperCasedHi);
    }

}
