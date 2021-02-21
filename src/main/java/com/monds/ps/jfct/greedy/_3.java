package com.monds.ps.jfct.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int min = 10001;
        int max = 0;
        for (int[] nums : arr) {
            for (int num : nums) {
                if (num < min) min = num;
            }
            if (min > max) max = min;
            min = 10001;
        }

        System.out.print(max);
    }
}
