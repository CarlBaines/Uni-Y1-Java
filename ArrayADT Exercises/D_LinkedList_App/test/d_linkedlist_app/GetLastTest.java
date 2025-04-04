/** GetLastTest.java
 * program to unit-test the getLast method of class LinkedList
 */
package d_linkedlist_app;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;


public class GetLastTest
{
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("\ntesting the getLast() method of class D_LinkedList\n");
    }
    
    
    /**
     * Test 1 of getLast method, of class D_LinkedList.
     */
    ////@Ignore
    @Test
    public void test_emptyList_noDataReturned()
    {
        System.out.println("> Test1 - getLast in empty list: should return sentinel value");
        int expResult = 999;
        System.out.print("creating an empty list...");
        D_LinkedList instance = new D_LinkedList();
        System.out.println("retrieving data value from last node of empty list...");
        int result = instance.getLast();
        // test value retrieved
        assertEquals(expResult, result);
        System.out.println("As expected, no data was retrieved");
    }
    
    
    /**
     * Test 2 of getLast method, of class D_LinkedList.
     */
    ////@Ignore
    @Test
    public void test_nonEmptyList_correctDataReturned()
    {
        System.out.println("> Test2 - getLast in non-empty list: should return value in last node of list");
        // create a non-empty list
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = {0, 0, 0, 0, 0};
        D_LinkedList instance = new D_LinkedList(a);
        // get to and mark end of list
        D_ListNode current = instance.head;
        int size = a.length;
        for (int i = 1; i < size; i++)
            current = current.next;
        int expResult = current.data;
        System.out.println("retrieving data value from last node in non-empty list...");
        int result = instance.getLast();
        // test value retrieved
        assertEquals("mismatch between value found in last node and value retrieved", expResult, result);
        System.out.println("As expected, data from last node in list was successfully retrieved");
    }      
}
