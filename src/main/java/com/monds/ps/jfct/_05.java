package com.monds.ps.jfct;

public class _05 {
    public static int solution(int n, int m, int[] arr) {
        int count = combination(n);
        int[] temp = new int[m + 1];
        for (int i : arr) {
            temp[i]++;
        }
        for (int i : temp) {
            if (i > 1) count -= combination(i);
        }
        return count;
    }

    private static int combination(int n) {
        return n * (n - 1) / 2;
    }
}
