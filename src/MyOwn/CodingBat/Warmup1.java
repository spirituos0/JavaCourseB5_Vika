package MyOwn.CodingBat;

public class Warmup1 {
    public static void main(String[] args) {
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        /* The parameter weekday is true if it is a weekday,
        and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation.
        Return true if we sleep in.
         */

        if (!weekday || vacation) { // ! - not; || - or
            return true; }
        else {
            return false;

        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        /* We have two monkeys, a and b, and the parameters
        aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling.
        Return true if we are in trouble.
         */

        if (aSmile && bSmile) { // && - and
            return true; }
        if (!aSmile && !bSmile) {
            return true; }
        else { // this line is optional
            return false;
        }
        /* can be shortened to:
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true; }
        else {
            return false;
        } */

    }

    public int sumDouble(int a, int b) {
        /* Given two int values, return their sum.
        Unless the two values are the same, then return double their sum.
         */
        int sum = a + b;
        if (a == b) { // == - equals
            sum = sum * 2; }
        return sum;

    }

    public int diff21(int n) {

        /* Given an int n, return the absolute difference between n and 21,
        except return double the absolute difference if n is over 21.
         */

        if (n > 21) {
            return 2 * (n - 21); }
        else {
            return 21 - n;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        /* We have a loud talking parrot.
        The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        Return true if we are in trouble
         */

        if (talking && (hour < 7 || hour > 20)) {
            return true; }
        else { return false;
        }
        // can be as short as:
        // return (talking && (hour < 7 || hour > 20)); and that's it
    }

    public boolean makes10(int a, int b) {
        //Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.

        return (a == 10 || b == 10) || (a+b==10);

    }

    public boolean nearHundred(int n) {
/* Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.
 */
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));

    }

    public boolean posNeg(int a, int b, boolean negative) {
    /* Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
     */

        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str) {
        /* Given a string, return a new string where "not "
        has been added to the front.
        req: However, if the string already begins with "not",
        return the string unchanged. Note: use .equals() to compare 2 strings.
         */
        // part 2: (requirement)
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        // str.substring(0,3) - a word from index 0 to 3 - in this case word 'not' in the beginning
        // >= - Greater than or equal to
        /* [str.length() >= 3] if length of the string is more than or equals 3,
        then return string unchanged without adding "not"
        */

        //this is part 1 in the exercise:
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        /* Given a non-empty string and an int n, return a new string
        where the char at index n has been removed.
        The value of n will be a valid index of a char in the original
        string (i.e. n will be in the range 0..str.length()-1 inclusive).
         */
        /* how solution looks like on the codingBat:
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        return front + back; */
        String newStr = "";
        newStr = str.substring(0,1) + str.substring(2,6);
        

        return newStr;
    }




}


