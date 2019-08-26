package tree;

public class Node <T> {
    protected T value;
    protected Node leftChild;
    protected Node rightChild;

    public Node(T value){
        this.value = value;
    }

    public Node(T value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

}
