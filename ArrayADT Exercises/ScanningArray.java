/**
 *
 * @author U0033257
 */
// ScanningArray.java
// Program to generate an array of random integers and scan it
// i.e. traverse it, in different ways
//
package scanningarray;

import java.util.Random;

public class ScanningArray {

    static final int arraySize = 15;
    static final int maxValue = 50;
    static final int MAX = 32767;

    //static int[] dataArray = new int[arraySize];
    static int[] dataArray = new int[]{41, 30, 19, 25, 38, 27, 2, 39, 23, 48, 7, 11, 16, 17, 24};

    public static void main(String[] args) {
        //Use the method below if you want to test you method with a random array of size maxValue
        //generateData(maxValue);

        printArrayContents("\n");
        System.out.println("");
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();

    }

//**You can find below some useful methods to generate random data or display the i-th element of your array**// 
    // generate array of data
    static void generateData(int maxDataValue) {
        Random randomGenerator = new Random();

        for (int i = 0; i < arraySize; i++) {
            dataArray[i] = randomGenerator.nextInt(maxDataValue);
        }
    }

    // print content of array
    static void printArrayContents(String labelText) {
        System.out.print(labelText + "Array contents: {");

        for (int i = 0; i < arraySize; i++) {
            System.out.print(dataArray[i] + " ");
        }

        System.out.println("}");
    }

    // print cell currently visited
    static void visitCell(int index) {
        System.out.printf("%2d ", dataArray[index]);
    }

    // pack white spaces left
    static void packLeft(int k) {
        for (int i = 0; i < k; i++) {
            System.out.print("   ");
        }
    }

    //###########################################################
    // scan array from left to right
    static void ex1() {
        System.out.print("Array scanned from left to right: {");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");
        }

        System.out.println("}");
    }

    // scan array from right to left
    static void ex2() {
        System.out.print("Array scanned from right to left: {");
        for (int i = dataArray.length - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println("}");
    }

    // scan array from left to centre, then right to centre
    static void ex3() {
        System.out.println("Array scanned from left to centre, then right to centre: {");
        for (int i = 0; i < (dataArray.length - 1) / 2; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println("");
        for (int j = dataArray.length - 1; j >= (dataArray.length - 1) / 2; j--) {
            System.out.print(dataArray[j] + " ");
        }

        System.out.println("}");

    }

    // scan array from centre to left, then centre to right
    static void ex4() {
        System.out.println("Array scanned from centre to left, then centre to right: {");
        for (int i = (dataArray.length - 1) / 2; i >= 0; i--) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println("");
        for (int j = (dataArray.length - 1) / 2; j < dataArray.length; j++) {
            System.out.print(dataArray[j] + " ");
        }

        System.out.println("}");
    }

    // scan array from left to right, then right to left
    static void ex5() {
        System.out.println("Array scanned from left to right, then right to left: {");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println("");
        for (int j = dataArray.length - 1; j >= 0; j--) {
            System.out.print(dataArray[j] + " ");
        }
        System.out.println("}");
    }

    // scan array from left to right, then right to left, as many time as there are items in the array
    static void ex6() {
        System.out.println("Array scanned from left to right, then right to left, as many times as there are items in the array:");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("{");
            for (int j = 0; j < dataArray.length; j++) {
                System.out.print(dataArray[j] + " ");
            }
            System.out.println("");
            for (int k = dataArray.length - 1; k >= 0; k--) {
                System.out.print(dataArray[k] + " ");
            }
            System.out.println("""
                               }
                               """);
        }

    }

    // scan array from left to right, then right to left, 
    // then repeat process but at right end, each time, one cell short than the previous pass
    static void ex7() {
        System.out.println("Array scanned from left to right, then right to left, then repeat process but at the right end, each time, one cell is removed from the previous pass: ");
        for (int h = dataArray.length; h >= 0; h--){
            for (int i = 0; i < h; i++){
                System.out.print(dataArray[i] + " ");
            }
            System.out.println("");
            for (int j = h - 1; j >= 0; j--){
                System.out.print(dataArray[j] + " ");
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("");
    }

    // scan array from left to right, then right to left, 
    // then repeat process but at left end, each time, one cell short than the previous pass
    static void ex8() {
        System.out.println("Array scanned from left to right, then right to left, then repeat process but at the left end, each time, one cell short than the previous pass");
        for (int h = 0; h < dataArray.length; h++) {
            for (int i = h; i < dataArray.length; i++) {
                System.out.print(dataArray[i] + " ");
            }
            System.out.println("");
            for (int j = dataArray.length - 1; j >= h; j--) {
                System.out.print(dataArray[j] + " ");
            }
            System.out.println("");
            System.out.println("");
        }
        
        
    }

}
