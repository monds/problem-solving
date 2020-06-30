package com.monds.algorithm.sort;

/**
 * Created by suahn on 2020-06-30
 */
public class MergeSort {

    private static void sort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, tmp, start, mid);
            sort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    public static void sort(int[] arr) {
        int[] tmp = new int[arr.length];
        sort(arr, tmp, 0, arr.length - 1);
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        // 정렬된 데이터를 보관하기 위해 copy
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        int index = start;
        int part1 = start;
        int part2 = mid + 1;

        // 양 쪽 파티션이 모두 끝날때까지 루프
        while (part1 <= mid && part2 <= end) {
            // 작은 숫자를 찾아서 타겟의 첫번째 빈 공간(index) 부터 채워넣는다.
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }

        // 앞 배열에 값이 남아 있는 경우
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmp[part1 + i];
        }
    }
}
