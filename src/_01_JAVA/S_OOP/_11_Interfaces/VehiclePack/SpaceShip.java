package _01_JAVA.S_OOP._11_Interfaces.VehiclePack;

public class SpaceShip implements Vehicle, Flying, Sailing {

    @Override
    public void speed() {
        System.out.println("Spaceship can speed up tp 1000 mph");
    }

    @Override
    public void fly() {
        System.out.println("Spaceship can fly to stars");
    }

    @Override
    public void sail() {
        System.out.println("Spaceship can also sail");
    }
}
