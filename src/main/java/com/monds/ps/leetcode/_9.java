package com.monds.ps.leetcode;

public class _9 {
    static class Solution {
        public boolean isPalindrome(int x) {
            return String.valueOf(x).equals(new StringBuilder("" + x).reverse().toString());
        }
    }
}
