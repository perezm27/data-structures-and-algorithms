package stacksandqueues;

public class  Node <T>{
    protected T value;
    protected Node next;


    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue(){
        return this.value;
    }

}
