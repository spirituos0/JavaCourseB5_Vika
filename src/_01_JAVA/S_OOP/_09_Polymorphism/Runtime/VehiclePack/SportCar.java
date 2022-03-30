package _01_JAVA.S_OOP._09_Polymorphism.Runtime.VehiclePack;

public class SportCar extends Vehicle {

    // we change implementation for this method
    @Override
    void speedUpTo60mph() {
        System.out.println("Sport car is speeding up to 60 in 3.2 seconds");
    }
}
