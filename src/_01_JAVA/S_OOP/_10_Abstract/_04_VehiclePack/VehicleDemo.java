package _01_JAVA.S_OOP._10_Abstract._04_VehiclePack;

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle sportCar = new SportCar(2018, 630);

        System.out.println(sportCar.getYear());
        System.out.println(sportCar.getHorsePower());

        sportCar.move(5000);
        sportCar.fuelUp(30);

        System.out.println("---------");

        Vehicle truck = new Truck(2022, 348);

        System.out.println(truck.getYear());
        System.out.println(truck.getHorsePower());

        truck.move(3000, " miles");
        truck.fuelUp(20);

    }

}
