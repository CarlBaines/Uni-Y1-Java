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
public class FileReadingExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Scanner for inputs.
        Scanner in = new Scanner(System.in);

        //try catch for exception handling when a file isnt found from the user input.
        try {

            while (true) {
                System.out.println("Enter name of file or type Quit to finish: ");
                //fileName is scanned in from the user.
                String fileName = in.nextLine();

                if (!"Quit".equals(fileName)) {
                    //New instance of the file class which takes fileName as the pathname.
                    File f = new File(fileName);

                    //Scanner for reading file object.
                    Scanner s = new Scanner(f);

                    //fileContents variable is set to the contents the scanner reads in from the file.
                    String fileContents = s.nextLine();

                    //outputs
                    System.out.println("File exists!");
                    System.out.println(fileContents);
                }
                
                System.out.println("EXITING PROGRAM");
                break;

            }

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error! File does not exist!");
        }

    }

}
