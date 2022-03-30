package _01_JAVA.S_OOP._03_AccessModifiersForClass.PackageTwo;

import _01_JAVA.S_OOP._03_AccessModifiersForClass.PackageOne.Boat;
import _01_JAVA.S_OOP._03_AccessModifiersForClass.PackageOne.Car;

public class Main1 {

    Car car = new Car(); // Public

    Boat boat = new Boat(); // Public

//    Plane plane = new Plane();
    // it's not available, because it is package-private class
    // the access modifier is default


}
