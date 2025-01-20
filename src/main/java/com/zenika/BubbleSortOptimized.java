package com.zenika;

public class BubbleSortOptimized {
    public static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimisation: si aucun échange n'a été effectué, le tableau est déjà trié
            if (!swapped) {
                break;
            }
        }
    }
}