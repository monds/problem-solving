package com.monds.ps.leetcode;

public class _7 {
    static class Solution {
        public int reverse(int x) {
            try {
                return ((x < 0) ? -1 : 1) * Integer.parseInt(new StringBuilder("" + Math.abs(x)).reverse().toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }
}
