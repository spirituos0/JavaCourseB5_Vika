package SatProjects.Week_2;

import java.util.Arrays;

public class KennySumTotal {
    public static void main(String[] args) {
        //create a 2D String array
        String[][] stringArray = {{"$12", "$22", "5"},{"€9", "€10", "€40", "$1" , "$2"}, {"€12", "6", "$4", "1"}};

        //get the string from the 2D string array
        String toString = Arrays.deepToString(stringArray);

        //deal with this string
        String stringDealWith = toString.replace("[","").replace("]","").
                replace(",","");

        //put all elementS of the string into an array
        String[] stringFrom2D = stringDealWith.split(" ");

        //declare a double array
        double[] doubleConvertByStringFrom2D = new double[stringFrom2D.length];
        //System.out.println(Arrays.toString(stringFrom2D));

        //according to requirement,store the value converted from string type into the double array
        for (int i = 0; i < stringFrom2D.length; i++) {
            if (stringFrom2D[i].startsWith("$")){
                doubleConvertByStringFrom2D[i] = Integer.parseInt(stringFrom2D[i].substring(1)) * 3.2;
            }else if (stringFrom2D[i].startsWith("€")){
                doubleConvertByStringFrom2D[i] = Integer.parseInt(stringFrom2D[i].substring(1)) * 4.2;
            }else{
                doubleConvertByStringFrom2D[i] = Integer.parseInt(stringFrom2D[i]);
            }

        }
        //System.out.println(Arrays.toString(doubleConvertByStringFrom2D));

        //calculate the sum of all values
        double sum = 0;
        for (int i = 0; i < doubleConvertByStringFrom2D.length; i++) {
            sum = sum + doubleConvertByStringFrom2D[i];
        }
        //System.out.println("The sum of all values: " + (double)Math.round(sum * 100) / 100);
        System.out.println((double)Math.round(sum * 100) / 100);

    }
}
