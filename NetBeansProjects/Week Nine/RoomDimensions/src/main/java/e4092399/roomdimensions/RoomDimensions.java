/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.roomdimensions;

import javax.swing.JOptionPane;

/**
 *
 * @author e4092399
 */
public class RoomDimensions {

    public static void main(String[] args) {
        
        double totalArea = 0;
        double totalVolume = 0;
        int inputAgain = 0;
        
        String roomName1 = JOptionPane.showInputDialog(null, "Enter the name of the room");
        double[] room1Dimensions = menu(roomName1, totalArea, totalVolume);
        
        
        System.out.printf("\n\nRoom name: %s", roomName1);
        System.out.printf("\nThe area of the room is: %f", room1Dimensions[0]);
        System.out.printf("\nThe volume of the room is: %f", room1Dimensions[1]);
        

        inputAgain = JOptionPane.showConfirmDialog(null, "Do you want to input another room's details?", "Enter more?", JOptionPane.YES_NO_OPTION);
            
        if (inputAgain == JOptionPane.YES_OPTION){
            String roomName2 = JOptionPane.showInputDialog(null, "Enter the name of the room");
            double[] room2Dimensions = menu(roomName2, totalArea, totalVolume);
            
            totalArea = room1Dimensions[0] + room2Dimensions[0];
            totalVolume = room1Dimensions[1] + room2Dimensions[1];

            System.out.printf("\n\nRoom name: %s", roomName2);
            System.out.printf("\nThe area of the room is: %f", room2Dimensions[0]);
            System.out.printf("\nThe volume of the room is: %f", room2Dimensions[1]);
            
            System.out.printf("\n\nThe total area of the rooms is: %f", totalArea);
            System.out.printf("\nThe total volume of the rooms is: %f", totalVolume);
            
        }
        else{
            System.exit(0);
        }
        
    }
    
    public static double[] menu(String roomName, double totalArea, double totalVolume){
        try{
            String dimensionsInput = JOptionPane.showInputDialog(null, "Enter the dimensions of the room in feet (Length x Width x Height) separated by spaces");
            
            String[] dimensionsInputArray = dimensionsInput.split(" ");
            double[] doubleArray = new double[3];
            
            for(int index = 0; index < dimensionsInputArray.length; index++){
                doubleArray[index] = Double.parseDouble(dimensionsInputArray[index]);
            }
            
            double area = doubleArray[0] * doubleArray[1];
            double volume = doubleArray[0] * doubleArray[1] * doubleArray[2];
            
            return new double[] {area, volume};
        }
        catch (Exception e){
            System.out.println("Error!Invalid Input! Please enter valid dimensions");
            return new double[] {0,0};
        }
    }

    
}
