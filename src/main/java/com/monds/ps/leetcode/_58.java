package com.monds.ps.leetcode;

public class _58 {
    static class Solution {
        public int lengthOfLastWord(String s) {
            String[] arr = s.split(" ");
            if (arr.length == 0) return 0;
            return arr[arr.length - 1].length();
        }
    }
}
