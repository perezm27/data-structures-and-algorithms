package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    /*
    Can successfully enqueue into a queue
    Can successfully enqueue multiple values into a queue
    Can successfully dequeue out of a queue the expected value
    Can successfully peek into a queue, seeing the expected value
    Can successfully empty a queue after multiple dequeues
    Can successfully instantiate an empty queue
     */

    @Test
    public void testEnqueue() {
        Queue newQueue = new Queue();
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(2);
        newQueue.enqueue(1);

        assertEquals("Queue: 3, 4, 2, 1", newQueue.toString());

    }

    @Test
    public void testDequeue() {
        Queue newQueue = new Queue();
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(2);
        newQueue.enqueue(1);

        newQueue.dequeue();

        assertEquals("Queue: 4, 2, 1", newQueue.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testDequeueUntilEmpty() {
        Queue newQueue = new Queue();
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(2);
        newQueue.enqueue(1);

        while(newQueue != null){
            newQueue.dequeue();
        }

    }

    @Test
    public void testPeek() {
        Queue newQueue = new Queue();
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(2);
        newQueue.enqueue(1);

        assertEquals(3, newQueue.peek());
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyQueue() {
        Queue newQueue = new Queue();

        newQueue.peek();
    }
}