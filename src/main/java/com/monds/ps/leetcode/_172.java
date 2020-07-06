package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-06
 */
public class _172 {
    static class Solution {
        public int trailingZeroes(int n) {
            if (n == 0) return 0;
            return (n / 5) + trailingZeroes(n / 5);
        }
    }
}
