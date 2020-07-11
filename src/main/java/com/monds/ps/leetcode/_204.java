package com.monds.ps.leetcode;

public class _204 {
    static class Solution {
        public int countPrimes(int n) {
            if (n <= 1) return 0;
            boolean[] primes = new boolean[n];
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (primes[i]) continue;
                count++;
                if (!primes[i]) {
                    for (int j = 2; i * j < n; j++) primes[i * j] = true;
                }
            }
            return count;
        }
    }
}
