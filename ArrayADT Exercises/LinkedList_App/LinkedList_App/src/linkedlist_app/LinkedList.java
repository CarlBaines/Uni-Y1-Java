// LinkedList.java
// program demonstrating the implementation and use of a linked-list in java
// taken from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class
package linkedlist_app;

public class LinkedList {

    // Data fields (member variable)
    ListNode head;	// pointer to first node in list

    // Methods
    // default constructor - creates an empty list
    public LinkedList() {
        head = null;
    }

    // Constructor - creates a list from an array. The array is passed as a parameter
    public LinkedList(int[] a) {
        // DO NOT MODIFY THIS CONSTRUCTOR.

        // Populate list.
        for (int i = a.length - 1; i >= 0; i--) {
            head = new ListNode(a[i], head);
        }

    }

    // postcondition: Adds a node storing obj at front of this list.
    public void addFirst(int obj) {
        ListNode current = head;
        head = new ListNode(obj, current);
        if (head.next != null) {
            current = current.next;
        }
        String s = obj + " has been added to the front of the linked list";
        System.out.println(s);
    }

    //postcondition: Returns the length of this list.
    public int getSize() {
        // current points to head
        ListNode current = head;
        int counter = 0;
        // checks if head points to null
        if (head == null) {
            // list is empty
            return counter;
        } else {
            // while current is not pointing to null
            while (current != null) {
                // current becomes the next element
                current = current.next;
                counter++;
            }
            return counter;
        }
    }

    // precondition: The last link node has a null link.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes.
    @Override
    public String toString() {
        // current points to head
        ListNode current = head;
        String s = "";
        // if list is empty
        if (head == null) {
            // return empty string
            return s;
        } else {
            while (current != null) {
                s += current.data + "\n";
                current = current.next;
            }
        }

        return s;
    }

    //postcondition: Returns int stored at head of this list.
    public int getFirst() {
        if (head == null) {
            return 999;
        } else {
            return head.data;
        }
    }

    //postcondition: Returns int stored at end of this list.
    public int getLast() {
        ListNode current = head;
        if (head == null) {
            return 999;
        }
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    // postcondition: Adds a node storing obj at end of this list.
    public void addLast(int obj) {
        ListNode newNode = new ListNode(obj);
        ListNode current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            String s = obj + " has been added to the end of the linked list";
            System.out.println(s);
        }
    }

    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a pointer to node containing a desired value, or null if not found
    public ListNode searchPointer(int n) {
        ListNode current = head;
        // If empty array
        if (head == null) {
            return null;
        } else {
            // Loops through array until current.next points to null
            while (current != null) {
                if (n == current.data) {
                    return current;
                }
                current = current.next;
            }
        }
        return null;
    }

    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a one-based index to node containing a desired value, or -1 if not found
    public int searchIndex(int n) {
        ListNode current = head;
        int index = 1;
        // If empty array
        if (head == null){
            return -1;
        }
        else{
            // loops through list
            while (current != null){
                if (n == current.data){
                    return index;
                }
                current = current.next;
                index++;
            }
        }
        return -1;
    }
    // end of method searchIndex()

//     precondition: list is pointed to by head; last node, if any, points to null
//     postcondition: nth node is deleted if it exists. A 1-based index is used
    public boolean delete(int n)
    {
        ListNode current = head;
        // One-based index
        int index = 1;
        if (head == null){
            return false;
        }
        else{
            while (current != null){
                if (n == current.data){
                    
                }
                current = current.next;
            }
        }
        return false;
    }

    // postcondition: retrieves the data stored in node at position index of list.
//    public int getAtPos(int index)
    {
        // YOUR CODE GOES HERE
    }

    // precondition: a list must exist with at least one node
    // postcondition: Adds a node storing obj after position index in list.
//    public boolean addAfterPos(int obj, int index)
    {
        // YOUR CODE GOES HERE
    }

    // Method used in print statements - DO NOT ALTER !
    public String ordinality(int n) {
        String pos;

        if ((n % 10 == 1) && (n != 11)) {
            pos = "st";
        } else if ((n % 10 == 2) && (n != 12)) {
            pos = "nd";
        } else if ((n % 10 == 3) && (n != 13)) {
            pos = "rd";
        } else {
            pos = "th";
        }

        return pos;
    }

} // end of class LinkedList
