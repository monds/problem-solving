package com.monds.ps.hackerrank.greedy;

import java.util.Arrays;

public class MinimumAbsoluteDifference {
    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (min > diff) min = diff;
        }
        return min;
    }
}
