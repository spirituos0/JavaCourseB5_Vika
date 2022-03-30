package _01_JAVA.W_Exceptions._05_Throws_Keyword;

import java.io.IOException;

public class DemoThrows {

    public static void main(String[] args) {

        AccountThrows account = new AccountThrows();

        try {
            account.deposit(-100);
        }
        catch (IOException ex) {
            System.out.println("The amount is not good!");
        }
    }
}
