package _01_JAVA.S_OOP._11_Interfaces.VehiclePack;

public class Car implements Vehicle {

    @Override
    public void speed() {
        System.out.println("Car can speed up to 160 mph");
    }
}
