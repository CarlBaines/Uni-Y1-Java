// D_LinkedList_App.java
// program to test class D_LinkedList
// adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
package d_linkedlist_app;

import java.util.Scanner;

public class D_LinkedList_App {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        D_LinkedList dlL1 = new D_LinkedList(arr);

        boolean isEmptyResult = dlL1.isEmpty();
        if (isEmptyResult == true) {
            System.out.println("List is empty!");
        } else {
            System.out.println("List is not empty!");
        }

        System.out.println("List has " + dlL1.getSize() + " elements");
        System.out.println(dlL1.toString());

        System.out.println("First element is " + dlL1.getFirst()
                + ", last element is " + dlL1.getLast());
        
        dlL1.addFirst(1);
        System.out.println(dlL1.toString());
        
        dlL1.addLast(2);
        System.out.println(dlL1.toString());
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        D_ListNode current = dlL1.searchPointer(n);
        if (current != null)
        {
            System.out.println("Found value : " + current.data);
        }
        else{
            System.out.println("Value was not found: " + current.data);
        }
        
        int p = dlL1.searchIndex(n);
        if (p != -1){
            System.out.println("Found value at position: " + p);
        }
        else{
            System.out.println("Value was not found at the position: " + p);
        }
            
        
        
        
        
//        System.out.println("List has " + dlL1.getSize() + " elements");
//        System.out.println("from left to right");
//        System.out.println("First element is " + dlL1.getFirst() +
//                                                ", last element is " + dlL1.getLast());
//        System.out.println("from right to left");
//        System.out.println(dlL1.toString_in_reverse());
//        
//        System.out.println("List has " + dlL1.getSize() + " elements");
//        System.out.println("from left to right");
//        System.out.println(dlL1.toString());
//        System.out.println("from right to left");
//        System.out.println(dlL1.toString_in_reverse());
//        
//        dlL1.addLast(3);
//        System.out.println("List has " + dlL1.getSize() + " elements");
//        System.out.println("from left to right");
//        System.out.println(dlL1.toString());
//        System.out.println("First element is " + dlL1.getFirst() +
//                                                ", last element is " + dlL1.getLast());
//        System.out.println("from right to left");
//        System.out.println(dlL1.toString_in_reverse());
//        
//        dlL1.addFirst(4);
//        System.out.println("List has " + dlL1.getSize() + " elements");
//        System.out.println("from left to right");
//        System.out.println(dlL1.toString());
//        System.out.println("First element is " + dlL1.getFirst() +
//                                                ", last element is " + dlL1.getLast());
//        System.out.println("from right to left");
//        System.out.println(dlL1.toString_in_reverse());
//        
//        dlL1.addFirst(5);
//        System.out.println("List has " + dlL1.getSize() + " elements");
//        System.out.println("from left to right");
//        System.out.println(dlL1.toString());
//        System.out.println("First element is " + dlL1.getFirst() +
//                                                ", last element is " + dlL1.getLast());
//        System.out.println("from right to left");
//        System.out.println(dlL1.toString_in_reverse());
//        
//        System.out.println("please enter the value to be searched");
//        int n = input.nextInt();
//        

//        System.out.println("please enter the node position to be deleted");
//        n = input.nextInt();
//        System.out.println("deleting " + n + dlL1.ordinality(n)  + " node...");
//        if (dlL1.delete(n) == true)
//            System.out.println("delete() returned true");
//        
//        System.out.println("from left to right");
//        System.out.println(dlL1.toString());
//        System.out.println("List has " + dlL1.getSize() + " elements");
//        System.out.println("First element is " + dlL1.getFirst() +
//                                                ", last element is " + dlL1.getLast());
//        System.out.println("from right to left");
//        System.out.println(dlL1.toString_in_reverse());
//        
//        
//        int[] a = {1, 2, 3, 4, 5, 6, 7};
//        D_LinkedList dlL2 = new D_LinkedList(a);
//       
//        System.out.println("List has " + dlL2.getSize() + " elements");
//        System.out.println("from left to right");
//        System.out.println(dlL2.toString());
//        System.out.println("First element is " + dlL2.getFirst() +
//                                                ", last element is " + dlL2.getLast());
//        System.out.println("from right to left");
//        System.out.println(dlL2.toString_in_reverse());
//   
//        System.out.println("please enter the node index whose data need retrieving");
//        p = input.nextInt();
//        System.out.println("node index " + p + " data value : " + dlL2.getAtPos(p));
//        
//        System.out.println("please enter the index after which to insert a new node");
//        p = input.nextInt();
//        if (dlL2.addAfterPos(10, p) == true)
//            System.out.println("node inserted");
//        System.out.println("from left to right");
//        System.out.println(dlL2.toString());
//        System.out.println("from right to left");
//        System.out.println(dlL2.toString_in_reverse());
//        
//        if (dlL2.addAfterPos(29, 1) == true)
//            System.out.println("node inserted in second position");
//        System.out.println("from left to right");
//        System.out.println(dlL2.toString());
//        
//        dlL2.addFirst(29);
//        System.out.println("node inserted in first position");
//        System.out.println("from left to right");
//        System.out.println(dlL2.toString());
//        
//        System.out.println("5" + dlL2.ordinality(n) + " item in list is now " + dlL2.getAtPos(5));
//        
//        D_LinkedList dlL3 = new D_LinkedList();
//        System.out.println("List dlL3 has " + dlL3.getSize() + " elements");
//        if (dlL3.isEmpty() == true)
//          System.out.println("List dlL3 is empty");
    }

} // end class D_LinkedList_App
