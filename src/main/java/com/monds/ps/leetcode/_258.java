package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-08
 */
public class _258 {
    static class Solution {
        public int addDigits(int num) {
            if (num < 10) return num;
            int res = num % 9;
            return res == 0 ? 9 : res;
        }
    }
}
