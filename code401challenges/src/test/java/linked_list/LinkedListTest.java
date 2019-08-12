package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert_withValues() {
        LinkedList ll = new LinkedList();

        ll.insert(new Node(3));
        ll.insert(new Node(7));
        ll.insert(new Node(2));
        ll.insert(new Node(1));

        assertEquals("Linked List: 1, 2, 7, 3", ll.toString());

    }

    @Test
    public void testInsert_null() {
        LinkedList ll = new LinkedList();


        assertNull("Linked List is not null", ll.head);

    }

    @Test
    public void testHeadValue() {
        LinkedList ll = new LinkedList();

        ll.insert(new Node(3));
        ll.insert(new Node(7));
        ll.insert(new Node(2));
        ll.insert(new Node(1));

        assertEquals("That is not the head of the Linked List", ll.head.value, 1);

    }

    @Test
    public void testIncludes_inList() {
        LinkedList ll = new LinkedList();

        ll.insert(new Node(3));
        ll.insert(new Node(7));
        ll.insert(new Node(2));
        ll.insert(new Node(1));

        assertTrue("Linked List does not include tested value", ll.includes(new Node(3)));
    }
    @Test
    public void testIncludes_notInList() {
        LinkedList ll = new LinkedList();

        ll.insert(new Node(3));
        ll.insert(new Node(7));
        ll.insert(new Node(2));
        ll.insert(new Node(1));

        assertFalse("Linked List includes tested value", ll.includes(new Node(5)));

    }
    @Test
    public void testIncludes_collectionInList() {
        LinkedList ll = new LinkedList();

        ll.insert(new Node(3));
        ll.insert(new Node(7));
        ll.insert(new Node(2));
        ll.insert(new Node(1));

        assertEquals("Linked List: 1, 2, 7, 3", ll.toString());

    }

}