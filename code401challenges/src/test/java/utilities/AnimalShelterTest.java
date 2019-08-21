package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testEnQueue() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enQueue("cat");
        shelter.enQueue("dog");
        shelter.enQueue("dog");

        assertEquals("Queue: cat", shelter.catQueue.toString());

        assertEquals("Queue: dog, dog", shelter.dogQueue.toString());

    }

    @Test
    public void testDeQueue() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enQueue("cat");
        shelter.enQueue("cat");
        shelter.enQueue("cat");
        shelter.enQueue("lizard");
        shelter.enQueue("dog");
        shelter.enQueue("hamster");
        shelter.enQueue("dog");

        shelter.deQueue("cat");
        shelter.deQueue("dog");

        assertEquals("Queue: cat, cat", shelter.catQueue.toString());

        assertEquals("Queue: dog", shelter.dogQueue.toString());

    }
}