package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;

public class BreadthFirst<T> extends Tree {


    public ArrayList<T> BFTraversal(Tree<Object> tree){
        ArrayList<T> output = new ArrayList<>();
        Queue<Node> queue = new Queue<>();

        if(tree.root == null){
            return output;
        } else {
            queue.enqueue(tree.root);
        }

        while(!queue.isEmpty()){

            if(queue.peek().leftChild != null){
                queue.enqueue(queue.peek().leftChild);

            if(queue.peek().rightChild != null){
                queue.enqueue(queue.peek().rightChild);
                }
            }

            output.add((T) queue.dequeue().getValue());
        }
        return output;
    }
}
