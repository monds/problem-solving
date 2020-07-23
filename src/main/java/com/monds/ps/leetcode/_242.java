package com.monds.ps.leetcode;

import java.util.Arrays;

public class _242 {
    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }
}
