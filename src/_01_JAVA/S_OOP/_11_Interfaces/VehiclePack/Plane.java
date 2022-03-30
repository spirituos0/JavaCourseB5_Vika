package _01_JAVA.S_OOP._11_Interfaces.VehiclePack;

public class Plane implements Vehicle, Flying {

    @Override
    public void speed() {
        System.out.println("Plane can speed up to 500 mph");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
