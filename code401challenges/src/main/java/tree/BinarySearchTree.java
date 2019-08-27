package tree;

public class BinarySearchTree <T extends Comparable<T>> extends Tree<Integer> {

//  BinarySearchTree Constructor
    public BinarySearchTree(){
        super();
    }

//  Cited source for implementation: https://www.baeldung.com/java-binary-tree

//  Recursively adds to BinarySearch Tree
    public void add(T value){
        this.root = addHelper(this.root,value);
    }

//  addHelper function
    public Node<T> addHelper(Node<T> currentNode, T value){

        if(currentNode == null){
           return new Node<>(value);
        }

        if(value.compareTo(currentNode.value) < 0){
            currentNode.leftChild = addHelper(currentNode.leftChild, value);
        }
        else if (value.compareTo(currentNode.value) > 0){
           currentNode.rightChild = addHelper(currentNode.rightChild, value);
        }
        return currentNode;
    }

//  Checks to see if a value exists in our BinarySearchTree
    public boolean contains(T value){
        return containsHelper(this.root, value);
    }

//  Contains helper function
    public boolean containsHelper(Node<T> currentNode, T value){
        if(currentNode == null){
            return false;
        }

        if (value == currentNode.value){
            return true;
        }

//  https://www.baeldung.com/java-ternary-operator
        return value.compareTo(currentNode.value) < 0 ?
                containsHelper(currentNode.leftChild, value) :
                containsHelper(currentNode.rightChild, value);
    }
}
