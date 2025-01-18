package pl.put.poznan.sorter.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BubbleSortTest {

    private final BubbleSort sorter = new BubbleSort();

    @Test
    public void testSortIntArrayRegular() {
        int[] input = {5, 3, 8, 6, 2};
        int[] expected = {2, 3, 5, 6, 8};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortIntArrayEmpty() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortIntArrayAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortIntArrayReverseSorted() {
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortIntArrayWithDuplicates() {
        int[] input = {4, 2, 4, 2, 1};
        int[] expected = {1, 2, 2, 4, 4};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortStringArrayRegular() {
        String[] input = {"banana", "apple", "cherry", "date"};
        String[] expected = {"apple", "banana", "cherry", "date"};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortStringArrayEmpty() {
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortStringArrayAlreadySorted() {
        String[] input = {"a", "b", "c", "d"};
        String[] expected = {"a", "b", "c", "d"};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortStringArrayReverseSorted() {
        String[] input = {"zebra", "yak", "xray", "apple"};
        String[] expected = {"apple", "xray", "yak", "zebra"};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    public void testSortStringArrayWithDuplicates() {
        String[] input = {"apple", "apple", "banana", "apple"};
        String[] expected = {"apple", "apple", "apple", "banana"};
        assertArrayEquals(expected, sorter.sort(input));
    }
}
