package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void testBFTraversal() {
        ArrayList<Integer> output = new ArrayList<>();
        BreadthFirst test = new BreadthFirst();
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(3);
        bst.add(7);
        bst.add(10);
        bst.add(1);
        bst.add(5);

        output.add(3);
        output.add(1);
        output.add(7);
        output.add(5);
        output.add(10);


        ArrayList<Integer> actual = test.BFTraversal(bst);

        assertEquals(output, actual);
    }

    @Test
    public void testBFTraversalEmpty() {
        ArrayList<Integer> output = new ArrayList<>();
        BreadthFirst test = new BreadthFirst();
        BinarySearchTree bst = new BinarySearchTree();

        ArrayList<Integer> actual = test.BFTraversal(bst);

        assertEquals(output, actual);
    }


}