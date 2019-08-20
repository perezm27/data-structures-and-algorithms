package stacksandqueues;

public class Queue {
    protected Node front;
    protected Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

//  Adds value to the end of the Queue
    public void enqueue(int value){
        Node newNode = new Node (value);
        if (this.front == null){
//  If Queue is empty the front and rear node are the same node.
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

//  Removes an item from the front of the Queue
    public int dequeue(){
        int value = this.front.getValue();
        if (this.front == null){
            throw new NullPointerException("top is null");
        } else {
            Node temp;
            temp = this.front;
            this.front = this.front.next;
            temp.next = null;
        }
        return value;
    }

//  Checks the value in the front of the Queue without removing that node.
    public int peek(){
        if (this.front == null){
            throw new NullPointerException("front is null");
        }
        return this.front.value;
    }


//  ToString Method
    public String toString(){
        StringBuilder output = new StringBuilder("Queue: ");
        Node node = this.front;

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
