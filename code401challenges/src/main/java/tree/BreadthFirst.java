package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;

public class BreadthFirst<T> extends Tree {


    public ArrayList<T> BFTraversal(Tree<Object> tree){
        ArrayList<T> output = new ArrayList<>();
        Queue<Node> queue = new Queue();

        if(tree.root == null){
            return output;
        } else {
            queue.enqueue(tree.root);
        }

        while(queue.peek() != null){
            if(queue.peek().leftChild != null){
                queue.enqueue(tree.root.leftChild);
            }

            if(queue.peek().rightChild != null){
                queue.enqueue(tree.root.rightChild);
            }

            output.add((T) queue.dequeue().getValue());
        }
        System.out.println(output);
        return output;
    }
}
