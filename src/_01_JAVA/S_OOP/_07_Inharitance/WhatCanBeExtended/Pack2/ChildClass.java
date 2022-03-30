package _01_JAVA.S_OOP._07_Inharitance.WhatCanBeExtended.Pack2;

import _01_JAVA.S_OOP._07_Inharitance.WhatCanBeExtended.Pack1.ParentClass;

public class ChildClass extends ParentClass {

    public void testMethod() {
//        super.defaultNumber = 10; <-
//        I can only access int defaultNumber field in the same package (Pack1 in this case)
        // no matter if I extended
        super.protectedNumber = 10; // with extension, I have access to protected access modifiers
    }

}
