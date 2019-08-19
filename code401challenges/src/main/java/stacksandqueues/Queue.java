package stacksandqueues;

public class Queue {
    protected Node front;
    protected Node rear;

//  Adds value to the end of the Queue
    public void enqueue (int value){
        Node newNode = new Node (value);
        if (front == null){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

    }

//  Removes an item from the front of the Queue
    public int dequeue(){
        int value = front.getValue();
        if (front == null){
            throw new NullPointerException("top is null");
        } else {
            Node temp;
            temp = front;
            front = front.next;
            temp.next = null;
        }
        return value;
    }

    public int peek(){
        if (front == null){
            throw new NullPointerException("top is null");
        }
        return front.value;
    }


    public String toString(){
        StringBuilder output = new StringBuilder("Queue: ");
        Node node = front;

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
