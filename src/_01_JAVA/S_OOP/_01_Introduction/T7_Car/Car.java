package _01_JAVA.S_OOP._01_Introduction.T7_Car;

public class Car {
    /*
    Instance variables (Fields):
    - belong to class
    - to access instance fields you nedd to create an object
    _ for each object 1 copy (of each instance variable) will be created
     */

    // instance fields:
    String name;
    String color;

    /*
    Static Variables Fields:
    - belong to class
    - to access static fields you need to call class name
    - there will be only 1 copy (of static variable)
     */

    static int numberOfCarsInMyInventory;
    // this field does not belong to any objects, it belongs to the class

    public void addToInventory() {
        numberOfCarsInMyInventory++;
        // ++ because when we call this method, every time it will add +1 object
    }

    public static void printNumberOfCarsInInventory() {
        System.out.println(numberOfCarsInMyInventory);
    }


}
