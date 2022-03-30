package _01_JAVA.S_OOP._05_Enum.T3_Directions;

public class MainDirections {

    public static void main(String[] args) {

        Directions directions1 = Directions.EAST;
        System.out.println(directions1.shortName);
//        directions1.shortName = "H"; <- we cannot do this, because String is final.
//        We could do this only if that'd not be final
    }
}
