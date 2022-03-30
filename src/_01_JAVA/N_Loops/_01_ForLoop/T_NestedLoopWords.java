package _01_JAVA.N_Loops._01_ForLoop;

public class T_NestedLoopWords {

    public static void main(String[] args) {

        String[][] strArray = {{"abc", "def", "ghi"}, {"jkl", "mno", "prs"}};

        for (int i = 0; i < strArray.length; i++) {

            for (int j = 0; j < strArray[i].length; j++) {
                System.out.println(strArray[i][j]);
            }
        }

    }
}
