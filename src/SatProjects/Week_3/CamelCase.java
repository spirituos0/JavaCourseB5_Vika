package SatProjects.Week_3;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(camelCase("my family lives in estonia"));
    }

    public static String camelCase(String str) {
        String words[] = str.split("\\s");
        String capitalizeStr = "";

        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String remainingLetters = word.substring(1);
            capitalizeStr += firstLetter.toUpperCase() + remainingLetters + " ";
        }

        return capitalizeStr;
    }
}
