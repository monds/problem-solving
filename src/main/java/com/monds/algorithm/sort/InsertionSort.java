package com.monds.algorithm.sort;

/**
 * Created by suahn on 2020-06-30
 */
public class InsertionSort {

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
    
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) swap(arr, j - 1, j);
            }
        }
    }

}
