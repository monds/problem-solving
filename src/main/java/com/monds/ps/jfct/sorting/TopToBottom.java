package com.monds.ps.jfct.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TopToBottom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
