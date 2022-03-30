package _01_JAVA.S_OOP.ImmutableExample;

public class ImmutableExClass {

    final int variable;

    public ImmutableExClass(int parameter) {
        this.variable = parameter;
    }
}

class test {

    public static void main(String[] args) {

        ImmutableExClass ex = new ImmutableExClass(10);
        System.out.println(ex.variable);
//        ex.variable = 20; <- we cannot update this value, because it's immutable
    }
}
