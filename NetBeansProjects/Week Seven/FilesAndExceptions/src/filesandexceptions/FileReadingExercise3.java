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
public class FileReadingExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner
        Scanner in = new Scanner(System.in);

        try {

            while (true) {
                System.out.println("Enter name of file or type QUIT to finish: ");
                
                //file name is scanned in from the user input.
                String fileName = in.nextLine();
                
                //IF QUIT, EXIT PROGRAM
                if (!"QUIT".equals(fileName)) {
                    
                    //new instance of file class
                    File f = new File(fileName);
                    
                    //Scanner for file.
                    Scanner s = new Scanner(f);
                    
                    System.out.println("File found!");
                    
                    double sum = 0;
                    
                    
                    //scans file while there is a next line
                    while (s.hasNextLine()){
                        
                        if (!s.hasNextDouble() &&  s.hasNext()){
                            s.next();
                        }
                        
                        //x is temp variable for reading in the numbers from the file. Used to calculate sum.
                        double x = s.nextDouble();
                        sum += x;
                        
                        //will get to line 3 of the file before throwing exception. 'Sophie' is the beginning of line 3.
                        System.out.println(x + s.nextLine());
                    }
                    
                    System.out.println("Total: " + sum);
                    //write this sum to result.txt file.
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
