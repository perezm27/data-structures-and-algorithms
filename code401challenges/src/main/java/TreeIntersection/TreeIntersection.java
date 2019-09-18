package TreeIntersection;

import tree.BinarySearchTree;

import java.util.ArrayList;

public class TreeIntersection {
    BinarySearchTree bt1 = new BinarySearchTree();
    BinarySearchTree bt2 = new BinarySearchTree();

    public static ArrayList treeIntersection(BinarySearchTree bt1, BinarySearchTree bt2){
       ArrayList set1 = bt1.inOrder();
       ArrayList set2 = bt2.inOrder();
       ArrayList container = new ArrayList();

        for (Object item : set1){
            if(set2.contains(item)){
                container.add(item);
            }
        }
        return container;

    }
}
