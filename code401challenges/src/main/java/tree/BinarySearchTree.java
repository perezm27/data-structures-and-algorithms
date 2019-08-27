package tree;

public class BinarySearchTree extends Tree<Integer> {

//  BinarySearchTree Constructor
    public BinarySearchTree(){
        super();
    }

//  Cited source for implementation: https://www.baeldung.com/java-binary-tree

//  Recursively adds to BinarySearch Tree
    public void add(int value){
        this.root = addHelper(this.root,value);
    }

//  addHelper function
    public Node<Integer> addHelper(Node<Integer> currentNode, int value){

        if(currentNode == null){
           return new Node(value);
        }

        if(value < currentNode.value){
            currentNode.leftChild = addHelper(currentNode.leftChild, value);
        }
        else if (value > currentNode.value){
           currentNode.rightChild = addHelper(currentNode.rightChild, value);
        }
        return currentNode;
    }

//  Checks to see if a value exists in our BinarySearchTree
    public boolean contains(int value){
        return containsHelper(this.root, value);
    }

//  Contains helper function
    public boolean containsHelper(Node<Integer> currentNode, int value){
        if(currentNode == null){
            return false;
        }

        if (value == currentNode.value){
            return true;
        }

//  https://www.baeldung.com/java-ternary-operator
        return value < currentNode.value ?
                containsHelper(currentNode.leftChild, value) :
                containsHelper(currentNode.rightChild, value);
    }
}
