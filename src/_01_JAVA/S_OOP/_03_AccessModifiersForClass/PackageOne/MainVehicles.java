package _01_JAVA.S_OOP._03_AccessModifiersForClass.PackageOne;

public class MainVehicles {

    Car car = new Car(); // Public Access Modifier (class); we can access it from any other package

    Boat boat = new Boat(); // Public Access Modifier (class)

    Plane plane = new Plane(); // Default Access modifier (class); outside this package it won't be accessible

}
