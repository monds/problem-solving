package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-13
 */
public class _231 {
    static class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 1) return true;
            if (n == 0 || n % 2 == 1) return false;
            return isPowerOfTwo(n / 2);
        }
    }
}
