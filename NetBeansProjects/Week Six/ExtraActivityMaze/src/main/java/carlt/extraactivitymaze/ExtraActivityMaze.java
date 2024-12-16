/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package carlt.extraactivitymaze;

import java.util.*;

/**
 *
 * @author Carlt
 */
public class ExtraActivityMaze {

    public static void main(String[] args) {
        //10x9 (2D) char array
        char[][] maze = {
            {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'}, // Row 0
            {'W', ' ', ' ', ' ', ' ', 'W', 'G', ' ', 'W'}, // Row 1
            {'W', ' ', 'W', 'W', 'W', 'W', 'W', ' ', 'W'}, // Row 2
            {'W', ' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'}, // Row 3
            {'W', ' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'}, // Row 4
            {'W', ' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'}, // Row 5
            {'W', ' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'}, // Row 6
            {'W', ' ', 'W', ' ', 'W', ' ', 'W', ' ', 'W'}, // Row 7
            {'W', 'P', ' ', ' ', ' ', ' ', ' ', ' ', 'W'}, // Row 8
            {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'} // Row 9
        };
        
        //W represents a wall.
        //P represents the player.
        //G represents the goal.
        
        
        //Programatically find the player instead of hardcoding the starting position.
        //iterate over the character array until the player is found and set starting position to the index where the player char is found.
        //loop through each row and column - correctly iterate over 2D array
        
        
        //'Draw' the maze 2D array to console.
        System.out.println(Arrays.deepToString(maze));
        System.out.println();
        
        for (int row = 0; row < maze.length; row++){
            //loop through each column in the current row
            for (int column = 0; column < maze[row].length; column++){
                if (maze[row][column] == 'P'){
                    //Print the starting position to (row, col)
                    System.out.println("Player found at row " + row + " and column " + column);
                    break;
                }
            }
        }
       

    }
}
