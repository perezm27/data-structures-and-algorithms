package stacksandqueues;

public class Node {
    protected int value;
    protected Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return this.value;
    }

}
