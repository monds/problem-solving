package com.monds.algorithm.sort;

/**
 * Created by suahn on 2020-06-30
 */
public class QuickSort {

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot, end);
        }
    }

    /**
     * partition
     * @param arr 정렬 대상 배열
     * @param start 시작 포인터
     * @param end 끝 포인터
     * @return 옮겨진 시작 포인터 위치
     */
    private static int partition(int[] arr, int start, int end) {
        // 임의의 pivot 기준 설정
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            // start 와 end 가 엇갈리지 않는지 체크
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

}
