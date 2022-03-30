package _01_JAVA.W_Exceptions.Types;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {


//        FileReader reader = new FileReader("ExampleFile.txt");
        // here we can see compiler error (red underline)
        // this class lets us know, that there might not be such file on the Computer
        // and if that file does not exist on the computer, it might throw an exception
        // to be able to run this code, we need to handle this exception

        try {
            FileReader reader = new FileReader("ExampleFile.txt");
        }
        catch (FileNotFoundException ex) {
            System.out.println("There is no such file!");
        }


    }
}
