package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-14
 */
public class _709 {
    static class Solution {
        public String toLowerCase(String str) {
            char[] s = str.toCharArray();
            for (int i = 0; i < s.length; i++) {
                if (s[i] >= 'A' && s[i] <= 'Z') {
                    s[i] = (char) (s[i] + ('a' - 'A'));
                }
            }
            return new String(s);
        }
    }
}
