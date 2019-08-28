package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void testBFTraversal() {
        ArrayList<Integer> output = new ArrayList<>();
        Tree t = new Tree();
        BreadthFirst test = new BreadthFirst();
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(3);
        bst.add(7);
        bst.add(10);
        bst.add(1);
        bst.add(5);

        output.add(3);
        output.add(7);
        output.add(10);
        output.add(1);
        output.add(5);


        ArrayList<Integer> actual = test.BFTraversal(bst);

        System.out.println(actual.toString());

        assertEquals(output, actual);


//        t.root.setValue(new Node<>(3));
//        t.root.setLeftChild(new Node(2));
//        t.root.setRightChild(new Node(5));
//        t.root.leftChild.setLeftChild(new Node(1));
//
//
//        System.out.println(t.toString());
//        assertEquals("test", t.root.getValue() );

    }
}