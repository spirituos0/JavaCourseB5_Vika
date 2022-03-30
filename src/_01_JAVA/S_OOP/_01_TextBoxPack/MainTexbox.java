package _01_JAVA.S_OOP._01_TextBoxPack;

public class MainTexbox {

    public static void main(String[] args) {

        Textbox texbox1 = new Textbox();

        System.out.println(texbox1.text);

        texbox1.setText("Hello World"); // we sat text to the textbox1

        System.out.println(texbox1.text);

        texbox1.clear();

        System.out.println(texbox1.text);
    }
}
