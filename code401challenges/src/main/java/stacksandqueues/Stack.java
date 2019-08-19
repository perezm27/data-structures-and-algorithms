package stacksandqueues;

public class Stack {
    protected Node top;

//  Adds new node to top
    public void push(int value){
        Node newNode = new Node (value);

        newNode.next = top;
        top = newNode;
    }

//  removes the node from the top of the stack,
//  and returns the node’s value.
    public int pop (){
        int value = top.getValue();
        if (top == null){
            throw new NullPointerException("top is null");
        } else {
            Node temp;
            temp = top;
            top = top.next;
        }

        return value;
    }

    public int peek(){
        if (top == null){
            throw new NullPointerException("top is null");
        }
        return top.value;
    }

    public String toString(){
        StringBuilder output = new StringBuilder("Stack: ");
        Node node = top;

        while(node != null){
            if(node.next != null){
                output = output.append(node.value + ", ");

            }else {
                output = output.append(node.value );
            }

//  Points to the next node
            node = node.next;
        }
        return output.toString();
    }
}
