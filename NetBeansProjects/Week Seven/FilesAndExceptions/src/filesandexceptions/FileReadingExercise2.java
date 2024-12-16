/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesandexceptions;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author YOUR NAME
 */
public class FileReadingExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner
        Scanner in = new Scanner(System.in);

        try {

            while (true) {
                System.out.println("Enter name of file or type QUIT to finish: ");

                String fileName = in.nextLine();

                if (!"QUIT".equals(fileName)) {
                    File f = new File(fileName);

                    Scanner s = new Scanner(f);
                    System.out.println("File found!");
                    
                    
                    int sum = 0;
                    while (s.hasNextLine()){
                        int x = s.nextInt();
                        sum += x;
                        System.out.println(x + s.nextLine());
                    }
                    
                    System.out.println("Total: " + sum);
                    break;
                    
                }

                System.out.println("EXITING PROGRAM");
                break;
            }

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error! File not found");
        }
    }

}
