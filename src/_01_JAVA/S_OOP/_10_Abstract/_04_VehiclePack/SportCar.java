package _01_JAVA.S_OOP._10_Abstract._04_VehiclePack;

public class SportCar extends Vehicle {

    public SportCar(int year, int horsePower) {
        super(year, horsePower);
    }
    @Override
    public void move(int meters) {
        System.out.println("Sport car has been moving " + meters + " meters");
    }
    @Override
    public void move(int units, String unit) {
        System.out.println("Sport car has been moving for " + units + unit);
    }
    @Override
    public void fuelUp(int liters) {
        System.out.println("Sport car will fuelUp " + liters + " liters");
    }
}
