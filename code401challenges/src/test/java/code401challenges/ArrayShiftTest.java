package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testArrayShiftExpected() {
        int[] testArr = new int[]{2,4,6,8};

        int testNumToBeAdded = 5;

        int[] expectedOutputArr = new int[]{2,4,5,6,8};


        assertArrayEquals(expectedOutputArr, ArrayShift.arrayShift(testArr, testNumToBeAdded));

    }
}