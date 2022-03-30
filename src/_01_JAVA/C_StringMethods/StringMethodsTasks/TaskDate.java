package _01_JAVA.C_StringMethods.StringMethodsTasks;

import java.util.Date;

public class TaskDate {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("Date object: " + now);

        String convertedNow = now.toString(); // date object to String
        System.out.println("Date converted to String: " + convertedNow);

        String numbersConvertedToStar = convertedNow.replaceAll("[0-9]", "*"); //replacement
        System.out.println(numbersConvertedToStar);

        System.out.println(convertedNow.equals(numbersConvertedToStar));



    }




}
