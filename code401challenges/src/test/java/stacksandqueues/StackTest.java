package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    /*
    Can successfully push onto a stack
    Can successfully push multiple values onto a stack
    Can successfully pop off the stack
    Can successfully empty a stack after multiple pops
    Can successfully peek the next item on the stack
    Can successfully instantiate an empty stack
     */

    @Test
    public void testPush() {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(3);
        newStack.push(4);
        newStack.push(8);

        assertEquals("Stack: 8, 4, 3, 1", newStack.toString());
    }

    @Test
    public void testPop() {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(3);
        newStack.push(4);
        newStack.push(8);
        newStack.pop();

        assertEquals("Stack: 4, 3, 1", newStack.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyPop() {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(3);
        newStack.push(4);
        newStack.push(8);

        while(newStack != null){
            newStack.pop();
        }
    }

    @Test
    public void testPeek() {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(3);
        newStack.push(4);
        newStack.push(8);

        assertEquals(8, newStack.peek());
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyStack() {
        Stack newStack = new Stack();

        newStack.peek();
    }


}