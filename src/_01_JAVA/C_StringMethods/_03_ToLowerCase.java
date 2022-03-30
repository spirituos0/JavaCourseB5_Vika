package _01_JAVA.C_StringMethods;

public class _03_ToLowerCase {

    public static void main(String[] args) {

        // strings are immutable
        // it means once you created a string, you cannot change it

        String countryName = "United States Of AMERICA";

        String lowerCasedCountryName = countryName.toLowerCase();
        //This is not going to update our string, it will return a new string
        // it made all the letters lower case

        System.out.println(countryName.toLowerCase());

        System.out.println(countryName);

        /* ex.: int x = 10;

        x= 20; - original x is updated */




    }
}
