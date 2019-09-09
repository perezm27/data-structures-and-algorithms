import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] testArr = new int[]{3,6,2,7,4};

        int[] expected = InsertionSort.insertionSort(testArr);

        assertEquals(expected, InsertionSort.insertionSort(testArr));
    }

    @Test
    public void testNullInsertionSort() {
        int[] testArr = new int[]{};

        int expected = 0;

        assertEquals(expected, testArr.length);
    }
}