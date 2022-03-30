package _01_JAVA.W_Exceptions._08_Recap.Task2;

public class StaticMethodClass {

    public static void main(String[] args) {

//        System.out.println(returnFirstLetter("TechnoStudy")); // <- here is all good
//        System.out.println(returnFirstLetter("1234567890")); // <- here too, even tho there are numbers

//        System.out.println(returnFirstLetter(""));
//        <- but here is no index 0, app is gonna crash in this case. It's a bug

//        System.out.println(returnFirstLetter(null)); // <- it's gonna crush here as well

    }

//    public static char returnFirstLetter(String str) {
//
//        char firstLetter = str.charAt(0);
//        return firstLetter;
    // this is not enough, because then we will get bugs, that is shown in above
    // we need to handle all possible exceptions

    public static char returnFirstLetter(String str) {

        try {
            char firstLetter = str.charAt(0);
            return firstLetter;
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("You cannot use empty string! Returning 0");
            return '0';
        } catch (NullPointerException ex) {
            System.out.println("You cannot use null value! Returning 0");
            return '0';
        }
    }

}
