/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.arraylistbasics;

import java.util.ArrayList;

/**
 *
 * @author e4092399
 */
public class ArrayListBasics {

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();

        //.add to add to collection.
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");

        //get method - first index from collection.
        colours.get(0);

        //set method - modify an existing element. Changes "Blue" at (2) to "Teal".
        colours.set(2, "Teal");

        System.out.println(colours);

        //Retrieve the number of elements in the arrayList.
        System.out.println("\n" + colours.size());

        //Individual elements can be removed from an arrayList using the remove method. Index one is removed.
        colours.remove(1);

        System.out.println(colours);

        //Retrieve the number of elements in the arrayList.
        System.out.println("\n" + colours.size());

        colours.clear();

        System.out.println(colours);
        System.out.println("\n" + colours.size());

    }
}
