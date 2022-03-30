package _01_JAVA.S_OOP._04_InstanceModifiers.PrivateModifier.Other;

import _01_JAVA.S_OOP._04_InstanceModifiers.PrivateModifier.Same.Cat;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();

//        cat.catName;
        // it's not accessible, because it is PRIVATE

//        cat.getCatName;
        // not accessible, because method is PRIVATE
    }
}
