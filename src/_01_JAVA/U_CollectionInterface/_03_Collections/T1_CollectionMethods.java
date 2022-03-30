package _01_JAVA.U_CollectionInterface._03_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T1_CollectionMethods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arrayList.add(sc.nextInt());
        }

        System.out.println("This is user's ArrayList: " + arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList after reverseOrder: " + arrayList);

        Collections.shuffle(arrayList);
        System.out.println("ArrayList after shuffle: " + arrayList);

        Collections.rotate(arrayList, 3);
        System.out.println("ArrayList after rotate by 3: " + arrayList);

        Integer max = Collections.max(arrayList);
        Integer min = Collections.min(arrayList);

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

        Collections.replaceAll(arrayList, max, min);
        System.out.println("ArrayList after replaceAll: " + arrayList);

    }
}
