package com.monds.ps.programmers;

public class _12940 {
    public int[] solution(int n, int m) {
        int min = 1, i = 2;
        while (i <= n && i <= m) {
            if (n % i == 0 && m % i == 0) min = i;
            i++;
        }
        return new int[] { min, n * m / min };
    }
}
