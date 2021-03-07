package com.monds.ps.jfct;

import java.util.Arrays;

public class _01 {
    public static int solution(int n, int[] arr) {
        Arrays.sort(arr);
        int index = n;
        int count = 0;
        while (index > 0) {
            index -= arr[index - 1];
            if (index < 0) break;
            count++;
        }
        return count;
    }
}
