package _01_JAVA.S_OOP._11_Interfaces.VehiclePack;

public class Demo {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.speed();

        Vehicle train = new Train();
        train.speed();

        Boat boat = new Boat();
        boat.speed();
        boat.sail();

        Plane plane = new Plane();
        plane.speed();
        plane.fly();

        SpaceShip spaceship = new SpaceShip();
        spaceship.speed();
        spaceship.sail();
        spaceship.fly();

    }

}
