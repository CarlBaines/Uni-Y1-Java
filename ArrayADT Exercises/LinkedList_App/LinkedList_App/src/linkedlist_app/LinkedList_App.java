// LinkedList_App.java
// program to test class LinkedList
// taken from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class

package linkedlist_app;

import java.util.Scanner;

public class LinkedList_App
{
    public static void main(String[] args)
    {   
        int[] a = new int[]{1,3,5,7,9};
        LinkedList lL = new LinkedList(a);
        System.out.println("The size of the linked list is: " + lL.getSize());
              	
        lL.addFirst(2);
        System.out.println(lL.toString());
        
        System.out.println("First index: \n" + lL.getFirst());
        
        System.out.println("Last index: \n" + lL.getLast());
        
        lL.addLast(2);
        System.out.println("\n" + lL.toString());
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value to be searched: ");
        int n = input.nextInt();

        ListNode current = lL.searchPointer(n);
        if (current != null)
        {
            System.out.println("Found value : " + current.data);
        }
        else{
            System.out.println("Value was not found in the linked list!");
        }

        int p = lL.searchIndex(n);
        if (p != -1){
            System.out.println("Found value at index: " + p);
        }
        else{
            System.out.println("The index for the value inputted was not found!");
        }

        System.out.println("Please enter the node to be deleted: ");
        n = input.nextInt();
        System.out.println("Deleting " + n + lL.ordinality(n)  + " Node...");
        if (lL.delete(n) == true){
            System.out.println("Delete() returned true");
        }
        else{
            System.out.println("The node: " + n + "was not present in the linked list thus cant be deleted!");
        }
            

//        System.out.println(lL.toString());
//        System.out.println("List has " + lL.getSize() + " elements");
//        System.out.println("First element is " + lL.getFirst() +
//                                                ", last element is " + lL.getLast());
//
//        int[] a = {1, 2, 3, 4, 5, 6, 7};
//        LinkedList lL1 = new LinkedList(a);
//
//        System.out.println("List has " + lL1.getSize() + " elements");
//        System.out.println(lL1.toString());
//        System.out.println("First element is " + lL1.getFirst() +
//                                                ", last element is " + lL1.getLast());
//
//        System.out.println("please enter the node index whose data need retrieving");
//        p = input.nextInt();
//        System.out.println("node index " + p + " data value : " + lL1.getAtPos(p));
//
//        System.out.println("please enter the index after which to insert a new node");
//        p = input.nextInt();
//        if (lL1.addAfterPos(10, p) == true)
//            System.out.println("node inserted");
//        System.out.println(lL1.toString());
//
//        LinkedList lL2 = new LinkedList();
//        if (lL2.addAfterPos(29, 1) == true)
//            System.out.println("node inserted in empty list");
//
//        lL2.addFirst(29);
//        if (lL2.addAfterPos(29, 1) == true)
//            System.out.println("node inserted in list");	

    }
	
} // end class LinkedList_App