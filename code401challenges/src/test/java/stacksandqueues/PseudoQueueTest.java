package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testEnQueue() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enQueue(1);
        testQueue.enQueue(2);
        testQueue.enQueue(3);
        testQueue.enQueue(4);
        testQueue.enQueue(5);

        assertEquals("Stack: 5, 4, 3, 2, 1", testQueue.stack1.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyEnQueue() {
        PseudoQueue testQueue = new PseudoQueue();

        testQueue.stack1.peek();
    }

    @Test
    public void testDeQueue() {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enQueue(1);
        testQueue.enQueue(2);
        testQueue.enQueue(3);
        testQueue.enQueue(4);
        testQueue.enQueue(5);

        assertEquals(1, testQueue.deQueue());
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyDeQueue() {
        PseudoQueue testQueue = new PseudoQueue();

        testQueue.stack2.pop();
    }


}