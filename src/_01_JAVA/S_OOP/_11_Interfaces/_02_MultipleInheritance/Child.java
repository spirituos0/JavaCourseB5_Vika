package _01_JAVA.S_OOP._11_Interfaces._02_MultipleInheritance;

public class Child implements ParentOne, ParentTwo {

    @Override
    public void methodOne() {
        System.out.println("This is from Paretnt 1");

        System.out.println(variable1); // from ParentOne
        System.out.println(variable3); // from ParentTwo

        System.out.println(ParentOne.variable2); // same name variable ParentOne
        System.out.println(ParentTwo.variable2); // same name variable from ParentTwo

    }

    @Override
    public void methodTwo() {
        // we override methodTwo() only once, even tho we have 2 of them
        System.out.println("Method 2");
    }

    @Override
    public void methodThree() {
        System.out.println("Method 3");
    }
}
