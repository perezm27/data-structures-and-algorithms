package utilities;

import tree.Tree;
import tree.Node;

import java.util.ArrayList;

public class FizzBuzzTree <T extends Comparable<T>> extends Tree {


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

    public ArrayList<Object> inOrderFizzBuzz(){
        ArrayList<Object> values = new ArrayList<>();
        if (this.root == null){
            return values;
        }
        fizzBuzzTree(this.root, values);

        return values;
    }


    public void fizzBuzzTree(Node curr, ArrayList<Object> values ){
        if(curr.leftChild != null){
            fizzBuzzTree(curr.getLeftChild(), values);
        }
        if ((int)curr.getValue() % 3 == 0 && (int)curr.getValue() % 5 == 0){
            values.add(curr.setValue("fizzbuzz"));
        }else if((int)curr.getValue() % 3 == 0){
            values.add(curr.setValue("fizz"));
        } else if ((int)curr.getValue() % 5 == 0){
            values.add(curr.setValue("buzz"));
        } else {
            values.add(curr.getValue());
        }
        if(curr.getRightChild() != null){
            fizzBuzzTree(curr.getRightChild(), values);
        }

    }
}
