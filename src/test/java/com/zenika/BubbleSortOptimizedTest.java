package com.zenika;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortOptimizedTest {
    BubbleSortOptimized bubbleSortOptimized = new BubbleSortOptimized();

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        bubbleSortOptimized.sort(arr);
        assertArrayEquals(new int[] {}, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSortOptimized.sort(arr);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testSortedArray() {
        int[] arr = {5, 5, 5, 5, 1};
        bubbleSortOptimized.sort(arr);
        assertArrayEquals(new int[] {1, 5, 5, 5, 5}, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSortOptimized.sort(arr);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testRandomArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        bubbleSortOptimized.sort(arr);
        assertArrayEquals(new int[] {1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    public void testSameSortedArray() {
        int[] arr = {2, 1, 1};
        bubbleSortOptimized.sort(arr);
        assertArrayEquals(new int[] {1, 1, 2}, arr);
    }
}