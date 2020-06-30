package com.monds.algorithm.sort;

/**
 * Created by suahn on 2020-06-30
 */
public class BubbleSort {

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static int[] sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) swap(arr, j, j + 1);
            }
        }
        return arr;
    }
}
