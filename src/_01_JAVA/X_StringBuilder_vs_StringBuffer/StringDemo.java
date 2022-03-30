package _01_JAVA.X_StringBuilder_vs_StringBuffer;

public class StringDemo {

    /**
        String is immutable (once created cannot be changed) object.
        Altering the value of string creates another object.
            - Meaning if we make any changes, it will be already another string.
     */

    public static void main(String[] args) {

//        String str = new String("TechnoStudy"); <- same as we do below:
        String str = "TechnoStudy";

        str.toUpperCase(); // this method doesn't update the original sting.
        // We only can create a new string object to get this 'updated' version

        System.out.println(str); // it's gonna stay the same, not updated. Strings are immutable
    }




}
