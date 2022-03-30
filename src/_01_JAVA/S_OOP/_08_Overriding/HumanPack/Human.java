package _01_JAVA.S_OOP._08_Overriding.HumanPack;

public class Human {

    String name;
    String gender;
    double age;

    public Human(String name, String gender, double age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println("Human is eating!");
    }

    public void transport() {
        System.out.println("Human is transporting!");
    }
}