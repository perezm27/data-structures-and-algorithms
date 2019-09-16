package HashtableExercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testHash() {
        Hashtable ht = new Hashtable(10);
        ht.hash("Melfi");
        ht.hash("perez");

        assertEquals(5, ht.hash("melfi"));
        assertEquals(5, ht.hash("melfi"));
    }

    @Test
    public void testAdd() {
        Hashtable ht = new Hashtable(20);
        ht.add("key2", "value 2");

        assertEquals("value 2", ht.get("key2") );
    }

    @Test
    public void testGet() {
        Hashtable ht = new Hashtable(20);
        ht.add("melfi", "perez");

        assertEquals("perez", ht.get("melfi") );
    }

    @Test
    public void testContains() {
        Hashtable ht = new Hashtable(20);
        ht.add("melfi", "perez");

        assertTrue(ht.contains("melfi"));
    }
}