// D_LinkedList.java
// program demonstrating the implementation and use of a doubly linked-list in java
// adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class

package d_linkedlist_app;

public class D_LinkedList
{
    // Data fields (member variable)
    D_ListNode head;	// pointer to first node in list

    // Methods
    // default constructor - creates an empty list
    public D_LinkedList()
    {
        head = null;
    }
  
    
    // Constructor - creates a list from an array. The array and its size are passed as parameters.
    // Constructor - creates a list from an array. The array and its size are passed as parameters.
    public D_LinkedList(int[] a)
    {
         for (int i = a.length - 1; i >= 0; i--) {
            D_ListNode n = new D_ListNode(a[i], head, null);
            if (head != null) {
                head.prev = n;
            }
            head = n;
        }
    }

    
    //Methods
    
    //Method to check if doubly linked lists is empty
    public boolean isEmpty()
    {
       return head == null;
    }
    
    
    // postcondition: Adds a node storing obj at front of this list.
    public void addFirst(int obj)
    {
        D_ListNode current = head;
        head = new D_ListNode(obj, current, null);
        if (current != null){
            current.prev = head;
        }
        String s = obj + " has been added to the front of the doubly linked list";
        System.out.println(s);
    }


    // postcondition: Returns int stored at head of this list.
    public int getFirst()
    {
        D_ListNode h = head;
        if (h == null){
            return 999;
        }
        return h.data;
        
    }

    // postcondition: Returns int stored at end of this list.
    public int getLast()
    {
        D_ListNode current = head;
        if (head == null){
            return 999;
        }
        else{
            while (current.next != null){
                current = current.next;
            }
            return current.data;
        }
    }

// postcondition: retrieves the data stored in node at position index of list.
//    public int getAtPos(int index)
    {
        // YOUR CODE GOES HERE
    }
    
    // postcondition: Adds a node storing obj at end of this list.
    public void addLast(int obj)
    {
        D_ListNode newNode = new D_ListNode(obj);
        D_ListNode current = head;
        if (head == null){
            head = newNode;
        }
        else{
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            // Need to link node at end of the list with previous node.
            newNode.prev = current;
            String s = obj + " has been added to the end of the doubly linked list";
            System.out.println(s);
        }
    }
    
    // postcondition: Adds a node storing obj after position index in list.
//    public boolean addAfterPos(int obj, int index)
    {
        // YOUR CODE GOES HERE
    }

        
    
    // postcondition: Returns the length of this list.
    public int getSize()
    {
        D_ListNode current = head;
        int counter = 1;
        if (head == null){
            return 0;
        }
        else{
            while (current.next != null){
                current = current.next;
                counter++;
            }
        }
        return counter;
    }

    
    // precondition: The last link node has a null link.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes.
    @Override
    public String toString()
    {
        D_ListNode current = head;
        String s = "";
        if (head == null){
            return "";
        }
        else{
            while (current != null){
                s += current.data + "\n";
                current = current.next;
            }
        }
        return s;
    }
    
    
    // precondition: The last link node has a null link.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes, starting from the last node.
//    public String toString_in_reverse()
    {
        // YOUR CODE GOES HERE
    }

    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: nth node is deleted if it exists. A 1-based index is used
//    public boolean delete(int n)
    {
        // YOUR CODE GOES HERE
    }// end of delete() method
    
    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a pointer to node containing a desired value, or null if not found
    public D_ListNode searchPointer(int n)
    {
        D_ListNode current = head;
        if (head == null){
            return null;
        }
        else{
            while (current != null){
                if (current.data == n){
                    return current;
                }
                current = current.next;
            }
        }
        return null;
    } 
    // end of method searchPointer()
    
    
    // precondition: list is pointed to by head; last node, if any, points to null
    // postcondition: returns a one-based index to node containing a desired value, or -1 if not found
    public int searchIndex(int n)
    {
       D_ListNode current = head;
       int index = 1; //one-based index
       if (head == null){
           return -1;
       }
       else{
           while (current != null){
               if (current.data == n){
                   return index;
               }
               current = current.next;
               index++;
           }
       }
       return -1;
    }
    // end of method searchIndex()
    
    
    public String ordinality(int n)
    {
        String pos;
          
        if ((n%10 == 1) && (n != 11))
            pos = "st";
        else if ((n%10 == 2) && (n != 12))
            pos = "nd";
        else if ((n%10 == 3) && (n != 13))
            pos = "rd";
        else
            pos = "th";
        
        return pos;
    }
        
} // end of class D_LinkedList
