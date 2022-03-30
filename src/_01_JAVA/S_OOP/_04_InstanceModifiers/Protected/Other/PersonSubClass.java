package _01_JAVA.S_OOP._04_InstanceModifiers.Protected.Other;

import _01_JAVA.S_OOP._04_InstanceModifiers.Protected.Same.Person;

public class PersonSubClass extends Person {
    // with subclass we can access protected fields

    public static void main(String[] args) {

        PersonSubClass personSubClass = new PersonSubClass();
        // we created an object of current class, but we will be able to access Person methods and fields
        System.out.println(personSubClass.personName);

        personSubClass.getPersonName();



    }

}
