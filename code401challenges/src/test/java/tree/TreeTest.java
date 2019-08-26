package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {
    /*
    Can successfully instantiate an empty tree
    Can successfully instantiate a tree with a single root node
    Can successfully add a left child and right child to a single root node
    Can successfully return a collection from a preorder traversal
    Can successfully return a collection from an inorder traversal
    Can successfully return a collection from a postorder traversal
     */

    @Test
    public void emptyTree(){
        BinarySearchTree bst = new BinarySearchTree();

        assertNotNull(bst);
    }

    @Test
    public void singleTree(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(1);

        assertEquals(1,bst.root.value);
    }

    @Test
    public void twoChildTree(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(1);
        bst.add(2);
        bst.add(3);


        assertTrue(bst.contains(1));
        assertTrue(bst.contains(2));
        assertTrue(bst.contains(3));
    }

    @Test
    public void testPostOrder() {
        ArrayList<Integer> post = new ArrayList<>();
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(10);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        post.add(9);
        post.add(7);
        post.add(5);
        post.add(3);
        post.add(10);

        ArrayList<Integer> actual = bst.postOrder();

        assertEquals(post, actual);

    }

    @Test
    public void testPreOrder() {
        ArrayList<Integer> post = new ArrayList<>();
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(10);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        post.add(10);
        post.add(3);
        post.add(5);
        post.add(7);
        post.add(9);

        ArrayList<Integer> actual = bst.preOrder();

        assertEquals(post, actual);
    }

    @Test
    public void testInOrder() {
        ArrayList<Integer> post = new ArrayList<>();
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(10);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        post.add(3);
        post.add(5);
        post.add(7);
        post.add(9);
        post.add(10);

        ArrayList<Integer> actual = bst.inOrder();

        assertEquals(post, actual);
    }

}