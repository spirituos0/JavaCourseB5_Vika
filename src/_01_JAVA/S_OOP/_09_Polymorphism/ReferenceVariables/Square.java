package _01_JAVA.S_OOP._09_Polymorphism.ReferenceVariables;

public class Square extends Rectangle {

    @Override
    String getShapeName() {
        return "Square";
    }

    @Override
    void printShapeName() {
        System.out.println("Square");
    }

    int getSide() {
        return 7;
    }
}
