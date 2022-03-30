package _01_JAVA.S_OOP._09_Polymorphism.Runtime.VehiclePack;

public class Truck extends Vehicle {

    @Override
    void speedUpTo60mph() {
        System.out.println("Truck is speeding up to 60 in 9 seconds");
    }
}
