package stacksandqueues;

public class Node {
    protected int value;
    protected Node next;
    protected Node front;
    protected Node rear;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return this.value;
    }

    public void getFront(Node front) {
        this.front = front;
    }

    public void getRear(Node rear) {
        this.rear = rear;
    }
}
