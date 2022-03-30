package MyOwn.CodingBat.String1;

public class nTwice {

    public static String nTwice(String str, int n) {

        boolean strLength = str.length() <= n;

        return str.substring(0,n) + str.substring(str.length()-n);
    }
}
