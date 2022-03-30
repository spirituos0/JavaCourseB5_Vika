package _01_JAVA.S_OOP._04_InstanceModifiers.PublicModifier.Other;

import _01_JAVA.S_OOP._04_InstanceModifiers.PublicModifier.Same.Car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mercedes");

        System.out.println(car.carName);

        car.getCarName();
    }



}
