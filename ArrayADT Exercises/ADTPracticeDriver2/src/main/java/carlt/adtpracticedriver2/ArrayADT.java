/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlt.adtpracticedriver2;

import java.util.Arrays;

/**
 *
 * @author Carlt
 */
public class ArrayADT {
    private int[] data;
    private int numberOfEntries; // how many elements are already in array.
    private int last; // the index of the last added item.
    private int capacity;
    
    // Constructor takes parameter size to fix the size of the array therein.
    public ArrayADT(int size){
        this.data = new int[size];
        numberOfEntries = 0;
        last = -1;
        capacity = size;
    }
    
    // Add a new entry into the array in the last available position.
    public String add(int entry){
        if (numberOfEntries == capacity){
            return "Array is full";
        }
        else{
            data[numberOfEntries] = entry;
            // What happens to the instance variables
            numberOfEntries += 1;
            last++;
            return entry + " has been correctly added";
        }
        
    }
    
    // Remove a component at a given position in the array.
    // data.length - 1 to accommodate for zero-based index
    public String remove(int position){
        // position >= data.length because the array has a length of five
        // can't be larger than or equal to because the last available index is [4]
        // accommodates zero-based index.
        if (position >= data.length){
            return "Invalid index";
        }
        // Looping through the array from the position parameter
        for (int i = position; i < data.length - 1; i++){
            // +1 to simulate shift.
            data[i] = data[i + 1];
        }
        // replace the number stored at the last index with zero.
        data[last] = 0;
        // What happens to the instance variables.
        numberOfEntries--;
        last--;
        return "The element has been removed";
    }
    
    // Return the component at a given index in the array.
    public int get(int index){
        // index is not valid if it is greater than the array length.
        // -1 to account for zero-based index
        // Cannot retrieve value from [5] if size of array is 5 since [4]
        // would be the last available index.
        if (index > data.length - 1){
            return -999;
        }
        else{
            return data[index];
        }
    }
    
    // Determine whether the array is empty or not.
    public boolean isEmpty(){
        if (data.length != 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    // Determine whether the array is full or not
    public boolean isFull(){
        System.out.println(capacity);
        if (numberOfEntries == capacity){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}
