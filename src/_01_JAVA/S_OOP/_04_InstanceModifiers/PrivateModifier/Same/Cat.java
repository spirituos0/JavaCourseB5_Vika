package _01_JAVA.S_OOP._04_InstanceModifiers.PrivateModifier.Same;

public class Cat {
    // private field is ONLY available inside this class
    private String catName;

    public Cat() {
        catName = "Some cat";
    }

    private Cat(String catName) {
        this.catName = catName;
    }

    private String getCatName() {
        return catName;
    }
}
