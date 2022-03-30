package _01_JAVA.S_OOP._11_Interfaces.VehiclePack;

public class Boat implements Vehicle, Sailing {

    @Override
    public void speed() {
        System.out.println("Boat can speed up to 50 mph");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing");
    }
}
