package _01_JAVA.S_OOP._09_Polymorphism.AnimalPack_BothTypes;

public class Animal {

    void run() {
        System.out.println("Animal is running");
    }
    public void run(int meters) {
        System.out.println("Animal has been running " + meters + " meters");
    }
    public void run(int units, String unit) {
        System.out.println("Animal has been running " + units + unit);
    }
    void makeSound() {
        System.out.println("Animal is making a sound");
    }


}
