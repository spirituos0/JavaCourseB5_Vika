package _01_JAVA.S_OOP._09_Polymorphism.Runtime.VehiclePack;

public class VehicleDemo {

    public static void main(String[] args) {

        /**
         * Run Time Polymorphism (Dynamic)
         *   - achieved by using METHOD OVERRIDING
         */

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new SportCar();
        Vehicle vehicle3 = new Truck();

        vehicle1.speedUpTo60mph(); // Vehicle is speeding up to 60 mph!
        vehicle2.speedUpTo60mph(); // Sport car is speeding up to 60 in 3.2 seconds
        vehicle3.speedUpTo60mph(); // Truck is speeding up to 60 in 9 seconds

    }
}
