package _01_JAVA.C_StringMethods;

import java.awt.*;

public class _17_ToString {

    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        /*
        - it's not a string
        - data type is Point, which is not String
        - if I type 'point.' , I don't see any string methods */
        System.out.println("This is point object: " + point1);

        String pointString = point1.toString();
        // point converted into a string
        // we cannot use String methods before converting
        System.out.println("This is point object converted to String: " + pointString);

        System.out.println(pointString.isEmpty());
        System.out.println(pointString.contains("x=1,y=1"));
        // don't put comma between these two indexes, otherwise, it shows false



    }

}
