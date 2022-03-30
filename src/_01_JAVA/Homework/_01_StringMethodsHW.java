package _01_JAVA.Homework;

public class _01_StringMethodsHW {

    public static void main(String[] args) {

        // 1. startsWith
        String first = "TechnoStudy SDET Course!";

        boolean ifStringStartsWithT = first.startsWith("T");
        System.out.println(ifStringStartsWithT);

        // 2. endsWith
        String second = "i love Java";

        boolean ifStringEndsWithJava = second.endsWith("java!");
        System.out.println(ifStringEndsWithJava);

        // 3. trim
        String third = "      There are 8 primitive data types in Java!         ";
        System.out.println(third.trim());

        // 4. replaceAll with *
        String forth = "My bank account number is 0987654323456789 and my rooting number is 48883280129.";
        String replacedForth = forth.replaceAll("[0-9]", "*");
        System.out.println(replacedForth);

        // 5. Replace "a" with '@'
        String fifth = "Practicing Java is really important!";
        String replacedA = fifth.replace("a", "@");
        System.out.println(replacedA);

        // 6. if empty. boolean
        String sixth = "     ";
        boolean isEmpty = sixth.isEmpty();
        System.out.println("String is empty: " + isEmpty);

        // 7. if equal. boolean
        String seventh1 = "HEY!";
        String seventh2 = "hey!";

        boolean isEqual = seventh1.equals(seventh2);
        System.out.println("Two strings are equal: " + isEqual);

        boolean isEqualIgnoreCase = seventh1.equalsIgnoreCase(seventh2);
        System.out.println("Two strings are equal, if ignoring case: " + isEqualIgnoreCase);








    }
}
