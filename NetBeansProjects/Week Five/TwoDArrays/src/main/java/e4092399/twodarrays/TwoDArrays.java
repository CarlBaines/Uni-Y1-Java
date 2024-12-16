/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.twodarrays;

import java.util.*;

/**
 *
 * @author e4092399
 */
public class TwoDArrays {

    public static void main(String[] args) {
        int[][] matrix1 = new int[2][3]; //2 rows, 3 columns

        System.out.println("Original 2D Array: " + Arrays.deepToString(matrix1));

        //Overwrite values
        matrix1[0][0] = 6; // row 0, col 0
        matrix1[0][1] = 4; // row 0, col 1
        matrix1[0][2] = 24; // row 0, col 2
        matrix1[1][0] = 1; // row 1, col 0
        matrix1[1][1] = -9; // row 1, col 1
        matrix1[1][2] = 8; // row 1, col 2

        //best way to output 2D arrays.
        System.out.println("Updated 2D Array: " + Arrays.deepToString(matrix1));

        //The array is declared and initialised at the same time.
        int[][] matrix2 = {
            {4, 0}, //Row 0
            {1, -9} //Row 1
        };

        System.out.println();
        System.out.println("Declared and Initialised 2D Array: " + Arrays.deepToString(matrix2));

        System.out.println("------------------------");
        System.out.println("The Goats of the Class: " + "\r");

        //Example of declaring 2D Arrays for Strings.
        String[][] string2dArray = new String[2][2];
        string2dArray[0][0] = "Carl";
        string2dArray[0][1] = "Luke";
        string2dArray[1][0] = "Vish";
        string2dArray[1][1] = "Arosh";
        for (String[] row : string2dArray) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
        
}
}
