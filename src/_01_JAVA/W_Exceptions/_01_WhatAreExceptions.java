package _01_JAVA.W_Exceptions;

public class _01_WhatAreExceptions {

    public static void main(String[] args) {

        sayHello(null);

/**        COMPILER ERROR:
             String str = new ArrayList<>(Integer);
              <--  we cannot store an arrayList inside a string

           RUNTIME EXCEPTION / UNCHECKED EXCEPTION:
             - occurs at the time of execution
             - includes programming bugs, such as logic errors or improper use of API or Library
             - Example: IndexOfBoundsException when trying to access array index that does not exist
             - if you don't handle it, there is NO compiler error

           CHECKED EXCEPTION:
             - includes Exception and all subclasses that do not extend RuntimeException
             - is checked (notified) by the compiler at compilation time
             - Example: FileNotFoundException, when trying to access file that doesn't exist
             - if you don't handle it, there will be compiler error

 */





    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name.toUpperCase());
    }
}
