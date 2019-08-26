package tree;

import java.util.ArrayList;

public class Tree <T> {
    protected Node root;

//  Tree Constructor
    public Tree(){
        this.root = null;
    }

//  Adds values in preOrder to List
    public ArrayList<T> preOrder(){
        ArrayList<T> values = new ArrayList<>();
        if (this.root == null){
            return values;
        }
        preOrderHelper(this.root, values);

        return values;
    }

//  Preorder Root, Left, Right
    protected void preOrderHelper(Node currentNode, ArrayList values){

        values.add(currentNode.getValue());

        if(currentNode.leftChild != null){
            preOrderHelper(currentNode.leftChild, values);
        }

        if(currentNode.rightChild != null){
            preOrderHelper(currentNode.rightChild, values);
        }

    }

//  Adds values in inOrder to List
    public ArrayList<T> inOrder(){
        ArrayList<T> values = new ArrayList<>();
        if (this.root == null){
            return values;
        }
        inOrderHelper(this.root, values);

        return values;
    }

//  Inorder Left, Root, Right
    protected void inOrderHelper(Node currentNode, ArrayList values){
        if (currentNode.leftChild != null){
            inOrderHelper(currentNode.leftChild, values);
        }

         values.add(currentNode.getValue());

        if (currentNode.rightChild != null){
            inOrderHelper(currentNode.rightChild, values);
        }

    }

//  Adds values in postOrder to List
    public ArrayList<T> postOrder(){
        ArrayList<T> values = new ArrayList<>();
        if (this.root == null){
            return values;
        }
        postOrderHelper(this.root, values);

        return values;
    }

//  Postorder Left, Right, Root
    protected void postOrderHelper(Node currentNode, ArrayList values){
        if(currentNode != null){
            postOrderHelper(currentNode.leftChild, values);
            postOrderHelper(currentNode.rightChild, values);
            values.add(currentNode.getValue());
        }
    }
}
