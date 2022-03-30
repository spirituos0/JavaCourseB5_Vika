package SatProjects.Week_1;

import java.util.Scanner;

public class _10_TwoString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two words (no comma, add space between words: ");
        String userString = scanner.nextLine();
        String[] words = userString.split(" ");
        String word1 = words[0];
        String word2 = words[1];

        String lastLetterWord1 = word1.substring(word1.length()-1);
        String firstLetterWord2 = word2.substring(0,1);
        String word2SkipFirstLetter = word2.substring(1);

        if (lastLetterWord1.equals(firstLetterWord2)) {
            System.out.print(word1.concat(word2SkipFirstLetter)); }
        else {
            System.out.println(word1.concat(word2));
        }
    }
}
/*
            Given two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

