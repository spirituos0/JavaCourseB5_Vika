package _01_JAVA.R_Methods.R_Methods2;

public class VoidHomework2 {

    public static void main(String[] args) {

        System.out.println(checkIfLetter('6'));

        char something = 65; // char something = 'A';
        System.out.println(something);

    }

    public static boolean checkIfLengthIs8(String str) {

//        boolean is8 = str.length() >= 8;
//        return is8;
        // instead of making it this way we can simplify it the way below:

        return str.length() >= 8;

    }

    public static boolean checkIfLetter(char character) {
        boolean isLetter = false;
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
            isLetter = true;
        return isLetter;
    }


    public static int countLetters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (checkIfLetter(character))
                count++;
        }
        return count;
    }

    public static boolean isDigit(char character) {
        return (character >= '0' && character <= '9');
    }

}

