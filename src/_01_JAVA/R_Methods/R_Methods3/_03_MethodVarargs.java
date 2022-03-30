package _01_JAVA.R_Methods.R_Methods3;

public class _03_MethodVarargs {
    // multiple Strings printed in the same line

    public static void main(String[] args) {
        System.out.println(allStringsInSameLine("Java", "Phyton", "JavaScript", "C"));

    }

    public static String allStringsInSameLine(String... varargs) {

//        String[] varargs = {"Java", "Phyton", "JavaScript", "C"};
        String allStrings = "";
        for (int i = 0; i < varargs.length; i++)
            allStrings += varargs[i];

        return allStrings;

    }


}
