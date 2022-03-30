package _01_JAVA.N_Loops._01_ForLoop;

import java.util.Arrays;

public class T_CopyArray {

    public static void main(String[] args) {

        String[] veggies = { "egg plant", "cucumber", "carrot", "beet", "cauliflower" };

        for (int i = 0; i < veggies.length; i++) {
            System.out.println(veggies[i]);
        }

        String[] copyVeggies = new String[veggies.length];

        for (int i = 0; i < copyVeggies.length; i++) {
            copyVeggies[i] = veggies[i];
        }
        System.out.println(Arrays.toString(copyVeggies));

        // instead of copying the reference, we copy all the values (as above)

        String[] copyByReferenceVeggies = veggies; // copy array with reference

        veggies[0] = "Update";

        System.out.println(Arrays.toString(veggies)); // it's updated
        System.out.println(Arrays.toString(copyByReferenceVeggies)); // this is updated too
        System.out.println(Arrays.toString(copyVeggies)); // this still looks like before updating

    }


}
