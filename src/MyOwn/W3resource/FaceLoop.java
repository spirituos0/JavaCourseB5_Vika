package MyOwn.W3resource;

import java.util.Arrays;

public class FaceLoop {
    public static void main(String[] args) {

        String[] face = new String[5];

        face[0] = " +\"\"\"\"\"+    ";
        face[1] = "[| o o |]    ";
        face[2] = " |  ^  |      ";
        face[3] = " | '-' |        ";
        face[4] = " +-----+";

        for (int i = 0; i < 5; i++)
        System.out.println(face[i]);

    }
}
