package _01_JAVA.W_Exceptions._04_Throw_Keyword;

public class Demo {

    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(-100);
        // since we have a condition for negative value, here is gonna be unchecked exception while running the code
        System.out.println(account.balance);


    }
}
