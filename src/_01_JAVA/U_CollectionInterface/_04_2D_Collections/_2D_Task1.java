package _01_JAVA.U_CollectionInterface._04_2D_Collections;

import java.util.ArrayList;

public class _2D_Task1 {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

           ArrayList<String> employees = new ArrayList<>();
           employees.add("Mike");
           employees.add("Peter");
           employees.add("Lisa");

           ArrayList<String> employers = new ArrayList<>();
           employers.add("Rob");
           employers.add("Alex");

           ArrayList<String> companies = new ArrayList<>();
           companies.add("Amazon");
           companies.add("Google");

        listOfLists.add(employees);
        listOfLists.add(employers);
        listOfLists.add(companies);

        System.out.println(listOfLists);

    }
}
