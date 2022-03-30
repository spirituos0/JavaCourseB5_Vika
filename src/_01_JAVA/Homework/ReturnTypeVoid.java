package _01_JAVA.Homework;

public class ReturnTypeVoid {

    public static void main(String[] args) {
        String one = "TechnoStudy";
        System.out.println("length of string is at least 8 characters: " + (atLeastEightCharter(one)));

        char letterOrNot = '9';
        System.out.println("character is letter: " + (isLetterOrNot(letterOrNot)));

        String letters = "abcde123";
        System.out.println("total number of letters in \"abcde123\": " + (countsLetters(letters)));

        char digit = '8';
        System.out.println("char 8 is a digit: " + (isDigitOrNot(digit)));



    }

    public static boolean atLeastEightCharter(String one) {
        return (one.length() >= 8);
    }

    public static boolean isLetterOrNot(char letterOrNot) {
        return (Character.isLetter(letterOrNot));
    }

    public static int countsLetters (String letters) {
        int count = 0;
        for (int i = 0; i < letters.length(); i++){
            if(Character.isLetter(letters.charAt(i)))
                count++;
        }
        return count;
    }
    public static boolean isDigitOrNot(char digit){
        return (Character.isDigit(digit));
    }
}


