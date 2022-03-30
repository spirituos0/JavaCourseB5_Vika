package _01_JAVA.S_OOP._01_Introduction.T2_Cat;

public class MainCat {

    public static void main(String[] args) {

        // 1 object
        Cat tom = new Cat();

        tom.color = "Grey";
        tom.age = 2;
        tom.meows();

        System.out.println("Tom's color is: " + tom.color);
        System.out.println("Age of Tom: " + tom.age);

        tom.printProperties();
        printCatProperties(tom);

        // 2 object
        Cat jerry = new Cat();

        jerry.color = "Brown";
        jerry.age = 1;
        jerry.meows();

        System.out.println("Jerry's color is: " + jerry.color);
        System.out.println("Age of Jerry: " + jerry.age);

        jerry.printProperties();
        printCatProperties(jerry);

    }

    public static void printCatProperties(Cat cat) {
        System.out.println("Color: " + cat.color);
        System.out.println("Age: " + cat.age);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
