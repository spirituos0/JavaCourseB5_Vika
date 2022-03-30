package _01_JAVA.S_OOP._01_Introduction.T7_Car;

public class MainCar {

    public static void main(String[] args) {

        Car car1 = new Car(); // to get access to the fields of Car class,
        // we need to create an object, that'd belong to that class
        car1.name = "Ford"; // now we have this access
        car1.color = "Red";
        car1.addToInventory(); // +1 car. we call this method to add this car to inventory

        Car car2 = new Car();
        car2.name = "BMW";
        car2.color = "White";
        car2.addToInventory(); // now 2 cars in inventory

        Car car3 = new Car();
        car3.name = "Toyota";
        car3.color = "Black";
        car3.addToInventory(); // now 3

        System.out.println(car1.name + car2.name);
        System.out.println(Car.numberOfCarsInMyInventory);


    }
}
