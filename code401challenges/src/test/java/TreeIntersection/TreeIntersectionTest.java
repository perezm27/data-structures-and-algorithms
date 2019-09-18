package TreeIntersection;

import org.junit.Test;
import tree.BinarySearchTree;
import tree.Tree;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void testTreeIntersection() {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.add(1);
        bst1.add(2);
        bst1.add(3);
        bst1.add(300);
        bst1.add(9);
        bst1.add(5);

        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.add(1);
        bst2.add(2);
        bst2.add(3);
        bst2.add(300);
        bst2.add(12);
        bst2.add(13);

        assertEquals("[1, 2, 3, 300]", TreeIntersection.treeIntersection(bst1, bst2).toString());
    }

    @Test
    public void testTreeIntersectionEmpty() {
        BinarySearchTree bst1 = new BinarySearchTree();
        BinarySearchTree bst2 = new BinarySearchTree();

        assertEquals("[]", TreeIntersection.treeIntersection(bst1, bst2).toString());
    }

}