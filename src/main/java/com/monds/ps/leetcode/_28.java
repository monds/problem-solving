package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-12
 */
public class _28 {
    static class Solution {
        public int strStr(String haystack, String needle) {
            if (needle == null || needle.length() == 0) return 0;
            int len = needle.length();
            for (int i = 0; i + len <= haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if (haystack.substring(i, i + len).equals(needle)) return i;
                }
            }
            return -1;
        }
    }
}
