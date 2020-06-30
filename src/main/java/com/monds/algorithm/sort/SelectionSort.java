package com.monds.algorithm.sort;

/**
 * Created by suahn on 2020-06-30
 */
public class SelectionSort {

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length - i; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            if (min != i) swap(arr, i, min);
        }
        return arr;
    }
}
