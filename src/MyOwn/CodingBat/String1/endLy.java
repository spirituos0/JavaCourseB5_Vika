package MyOwn.CodingBat.String1;

public class endLy {

    public static boolean endsLy(String str) {

        boolean answer = false;
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        }
        return answer;
    }
}
