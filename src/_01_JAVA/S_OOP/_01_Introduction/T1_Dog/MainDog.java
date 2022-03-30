package _01_JAVA.S_OOP._01_Introduction.T1_Dog;

public class MainDog {

    public static void main(String[] args) {

        // to create an object we use 'new' keyword

        Dog lucy = new Dog(); // lucy - identifier for our object

        lucy.breed = "Neapolitan Mastiff"; // initialize breed property of lucy object
        lucy.size = "Large";
        lucy.age = 5;
        lucy.color = "Black";

        System.out.println(lucy.breed);
        System.out.println(lucy.age);

        lucy.eat();

        lucy.sleep();
        lucy.snoring();

        lucy.wakeUp();
        lucy.snoring(); // now it's not gonna print his, because she woke up

        // ------------------------------------------------------- \\

        Dog max = new Dog();

        max.breed = "Maltese";
        max.size = "Small";
        max.age = 2;
        max.color = "White";

        System.out.println(max.size);
        System.out.println(max.color);

        max.sleep();
        System.out.println(max.isSleeping);

        max.wakeUp();
        System.out.println(max.isSleeping);

        // -----------------------------\\

        Dog cooper = new Dog();

        max.breed = "Chow Chow";
        max.size = "Medium";
        max.age = 3;
        max.color = "Brown";
        cooper.isSleeping = true;

        cooper.wakeUp();
        System.out.println(cooper.isSleeping);

    }
}
