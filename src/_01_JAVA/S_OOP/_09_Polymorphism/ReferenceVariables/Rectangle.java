package _01_JAVA.S_OOP._09_Polymorphism.ReferenceVariables;

public class Rectangle extends Shape {

    @Override
    String getShapeName() {
        return "Rectangle";
    }

    @Override
    void printShapeName() {
        System.out.println("Rectangle");
    }

    int getLength() {
        return 5;
    }
}
