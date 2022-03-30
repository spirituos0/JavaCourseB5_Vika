package _01_JAVA.C_StringMethods.Homeworks;

public class Task2 {

    public static void main(String[] args) {

        String first = "I love java!";
        int lengthOfFirst = first.length();
        System.out.println("Length of the first string is: " + lengthOfFirst);

        String second = "Sprint planning";
        int lengthOfSecond = second.length();
        System.out.println("length of the second string is: " + lengthOfSecond);

        String third = "paper";
        String upperCasedThird = third.toUpperCase();
        System.out.println(upperCasedThird);

        String forth = "OraNge";
        String lowerCasedForth = forth.toLowerCase();
        System.out.println(lowerCasedForth);

        String fifth = "New Jersey";
        String upperCasedFifth = fifth.toUpperCase();
        System.out.println(upperCasedFifth);

        String sixth = "New York";
        String lowerCasedSixth = sixth.toLowerCase();
        System.out.println(lowerCasedSixth);

        String seventh = "apple";
        boolean containsApp = seventh.contains("app");
        System.out.println("Word \'apple\' contains \'app\': " + containsApp);

        String eighth = "Florida";
        int indexOfO = eighth.indexOf("o");
        System.out.println("Index of \'o\' is: " + indexOfO);

        String ninth = "Thank You";
        int indexOfY = ninth.indexOf("Y");
        System.out.println("Index of \'Y\' is: " + indexOfY);

        String tenth = "Friend";
        char atThirdIndex = tenth.charAt(3);
        System.out.println("Character at third index is: " + atThirdIndex);




    }

}
