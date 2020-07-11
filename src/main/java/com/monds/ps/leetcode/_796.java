package com.monds.ps.leetcode;

public class _796 {
    static class Solution {
        public boolean rotateString(String A, String B) {
            return A.length() == B.length() && (A + A).contains(B);
        }
    }
}
