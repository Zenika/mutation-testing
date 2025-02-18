package com.zenika.corrected;

import org.junit.jupiter.api.Test;

import com.zenika.BubbleSort2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortCorrectedTest {
    BubbleSort2 bubbleSort = new BubbleSort2();

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int nb = bubbleSort.sort(arr);
        assertArrayEquals(new int[] {}, arr);
        assertEquals(0, nb);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int nb = bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
        assertEquals(1, nb);
    }

    @Test
    public void testSameArray() {
        int[] arr = {5, 5, 5, 5, 1};
        int nb = bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 5, 5, 5, 5}, arr);
        assertEquals(4, nb);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int nb = bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
        assertEquals(4, nb);
    }

    @Test
    public void testRandomArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int nb = bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
        assertEquals(6, nb);
    }

    @Test
    public void testSameSortedArray() {
        int[] arr = {2, 1, 1, 1};
        int nb = bubbleSort.sort(arr);
        assertArrayEquals(new int[] {1, 1, 1, 2}, arr);
        assertEquals(2, nb);
    }

    @Test
    public void testUniqSortedArray() {
        int[] arr = { 1, 1, 1 };
        int nb = bubbleSort.sort(arr);
        assertArrayEquals(new int[] { 1, 1, 1 }, arr);
        assertEquals(1, nb);
    }
}