package _01_JAVA.S_OOP._04_InstanceModifiers.DefaultAccessModifier.Same;

public class Main {
// default AM is accessible only inside of same package
    public static void main(String[] args) {

        Truck truck = new Truck("Volvo");

        System.out.println(truck.truckName);

        truck.getTruckName();
    }
}
