package stacksandqueues;

public class PseudoQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enQueue(int value){
//  pushes values into first stack
        stack1.push(value);
    }

    public int deQueue(){
//  Checks to see if stack2 is empty
        if (stack2.top == null){
//  while there are still values in stack1 push them into stack2
            while(stack1.top != null){
                stack2.push(stack1.pop());
            }
        }
//  returns the top value in stack2
        return stack2.pop();
    }
}
