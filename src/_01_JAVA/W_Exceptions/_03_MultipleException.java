package _01_JAVA.W_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _03_MultipleException {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("ExampleFile.txt");
            reader.read();
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist!");
        } catch (IOException ex) {
            System.out.println("Not able to read!");
        }

    }
}
