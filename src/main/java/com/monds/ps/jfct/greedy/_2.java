package com.monds.ps.jfct.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int first = arr[arr.length - 1];
        int second = arr[arr.length - 2];
        int result = 0;

        while (true) {
            for (int i = 0; i < k; i++) {
                if (m == 0) break;
                result += first;
                m--;
            }
            if (m == 0) break;
            result += second;
            m--;
        }

        System.out.print(result);
    }
}
