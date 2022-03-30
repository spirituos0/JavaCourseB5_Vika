package _01_JAVA.A_VeryBasics;

public class JavaVariableRecap {

    public static void main(String[] args) {

        int mile = 50;

        System.out.println(mile);
        /* we don't put strings ", because we don't need
        to see the word 'mile', but we need to see number */

        int nycTemp = 18;
        int laTemp = nycTemp;

        System.out.println(nycTemp);
        System.out.println(laTemp);

        int year = 2010;
        System.out.println(year);
        year = 2020;
        System.out.println(year);

        int worldCupYear = 2022;
        // camelCase naming convention when we are creating variables


        /* variable name cannot start with numbers or characters like
        ! @ # % ^ & * ( ) _ +
        example: int 2013yearBeforeWorldCup = 22222
        */

        // I can use _ only with number afterwards, but not by itself:
        int _1 = 45;

        // $ is allowed:
        int $ = 20;




    }

}
