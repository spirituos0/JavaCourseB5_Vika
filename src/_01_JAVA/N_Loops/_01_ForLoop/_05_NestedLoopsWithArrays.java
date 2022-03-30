package _01_JAVA.N_Loops._01_ForLoop;

public class _05_NestedLoopsWithArrays {
     public static void main(String[] args) {

          int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//          numbers [1].length; - finding length of inside array

          // printing each element of array
//          System.out.println(numbers[1][0]);
//          System.out.println(numbers[1][1]);
//          System.out.println(numbers[1][2]);

          for (int i = 0; i < numbers.length; i++) {

               for (int j = 0; j < numbers[i].length; j++) {
                    System.out.println(numbers[i][j]);
               }
          }
     }
}
