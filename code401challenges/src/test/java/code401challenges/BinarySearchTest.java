package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] sortedArr = new int[]{4,8,15,16,23,42};
        int key = 15;

        int expectedOutput = 2;

        assertEquals(expectedOutput, BinarySearch.binarySearch(sortedArr, key));
    }

    @Test
    public void testBinarySearch_notInArr() {
        int[] sortedArr = new int[]{4,8,15,16,23,42};
        int key = 55;

        int expectedOutput = -1;

        assertEquals(expectedOutput, BinarySearch.binarySearch(sortedArr, key));
    }
}