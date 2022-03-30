package _01_JAVA.S_OOP._07_Inharitance.Animal;

public class Horse extends Animal {

    String color;
    int weight;

    public Horse(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    public void yell() {
        System.out.println("Neeeiiight");
    }
    public void gallop() {
        System.out.println("Clump-Clump");
    }

}
