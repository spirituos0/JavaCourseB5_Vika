package _01_JAVA.T_Wrapper;

public class _02_AutoBoxingAndUnboxing {

    public static void main(String[] args) {

        byte primitiveVariable = 10;

        Byte referenceVariable = primitiveVariable;
        // autoboxing (converting from primitive type into a reference)

        Character referenceChar = 'A';
        char primitiveChar = referenceChar; // unboxing

    }
}
