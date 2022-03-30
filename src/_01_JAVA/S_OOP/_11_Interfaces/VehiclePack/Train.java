package _01_JAVA.S_OOP._11_Interfaces.VehiclePack;

public class Train implements Vehicle {

    @Override
    public void speed() {
        System.out.println("train can speed up to 100 mph");
    }
}
