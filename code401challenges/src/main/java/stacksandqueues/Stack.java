package stacksandqueues;

public class Stack<C> {
    protected Node top;

//  Adds new node to top
    public void push(C value){
        Node newNode = new Node (value);

        newNode.next = this.top;
        this.top = newNode;
    }

//  Removes the node from the top of the stack
    public C pop(){
        C value = (C) this.top.getValue();
        if (this.top == null){
            throw new NullPointerException("top is null");
        } else {
            Node temp;
            temp = this.top;
            this.top = this.top.next;
        }
        return value;
    }

//  Checks the value in the front of the Queue without removing that node.
    public C peek(){
        if (this.top == null){
            throw new NullPointerException("top is null");
        }
        return (C) this.top.value;
    }

//  ToString Method
    public String toString(){
        StringBuilder output = new StringBuilder("Stack: ");
        Node node = this.top;

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
