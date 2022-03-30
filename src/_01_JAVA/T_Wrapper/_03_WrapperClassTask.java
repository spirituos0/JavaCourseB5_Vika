package _01_JAVA.T_Wrapper;

public class _03_WrapperClassTask {

    public static void main(String[] args) {

        System.out.println(twice(5)); // calling method with primitive type

//        twice(10) <- if we call it ths way,
//        we are still calling primitive one by default instead of overloaded one

        // to call overloaded one, we need to provide a reference type variable:
        Integer number = 10;
        System.out.println(twice(number));

    }

    public static int twice(int number) {
        return number * 2;
    }

    public static Integer twice(Integer number) {
        return number * 2;
    }

}
