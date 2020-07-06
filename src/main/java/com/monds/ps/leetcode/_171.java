package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-06
 */
public class _171 {
    static class Solution {
        public int titleToNumber(String s) {
            int res = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                res += ((int) s.charAt(i) - 64) * Math.pow(26, s.length() - i - 1);
            }
            return res;
        }
    }
}
