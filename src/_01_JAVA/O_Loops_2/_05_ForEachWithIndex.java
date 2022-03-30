package _01_JAVA.O_Loops_2;

public class _05_ForEachWithIndex {

    // find out the index where string starts with 'm'

    public static void main(String[] args) {

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        // we cannot solve this task using for each loop, because we don't know index
        for (String item : list) {
            if (item.startsWith("m")) {
                System.out.println(item);
            }
        }
    }
}
