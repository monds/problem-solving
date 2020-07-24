package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-24
 */
public class _392 {
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() > t.length()) return false;
            int pre = -1;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int idx = t.indexOf(c, pre + 1);
                if (idx == -1 || pre > idx) return false;
                if (idx == t.length() - 1 && i < s.length() - 1) return false;
                pre = idx;
            }
            return true;
        }
    }
}
