package _01_JAVA.S_OOP._07_Inharitance.Shape;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
        super.perimeter = side * 4;
        super.area = side * side;
        super.name = "Square is a special rectangle";
    }
    public void sides() {
        System.out.println("All sides of a square are equal in length.");
    }
}
