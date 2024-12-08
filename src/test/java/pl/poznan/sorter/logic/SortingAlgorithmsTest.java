package pl.poznan.sorter.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pl.put.poznan.sorter.logic.SortingAlgorithm;

public class SortingAlgorithmsTest {

    @Test
    public void testSort() {
        int[] arr = {3, 1, 2};
        SortingAlgorithm.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }
}
