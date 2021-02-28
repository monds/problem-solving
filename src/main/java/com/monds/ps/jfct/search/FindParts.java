package com.monds.ps.jfct.search;

import java.util.Arrays;
import java.util.Scanner;

public class FindParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        for (int i : x) {
            System.out.printf("%s ", binarySearch(arr, i) == -1 ? "no" : "yes");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == target) return mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else begin = mid + 1;
        }
        return -1;
    }
}
