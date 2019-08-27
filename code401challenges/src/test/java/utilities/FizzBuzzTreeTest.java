package utilities;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void testInOrderFizzBuzz() {
        ArrayList<Object> post = new ArrayList<>();
        FizzBuzzTree ftree = new FizzBuzzTree();

        post.add(2);
        post.add("buzz");
        post.add("fizz");
        post.add("buzz");
        post.add("fizzbuzz");

        ftree.add(10);
        ftree.add(5);
        ftree.add(2);
        ftree.add(9);
        ftree.add(15);

        ArrayList<Object> actual = ftree.inOrderFizzBuzz();

        assertEquals(post, actual);
    }
}