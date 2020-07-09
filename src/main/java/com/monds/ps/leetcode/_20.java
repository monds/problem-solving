package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-09
 */
public class _20 {
    static class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 == 0) {
                while (true) {
                    String change = replaceBracket(s);
                    if (change.equals("")) return true;
                    if (change.equals(s)) return false;
                    s = change;
                }
            }
            return false;
        }
        private String replaceBracket(String s) {
            return s.replaceAll("(\\(\\)|\\[\\]|\\{\\})", "");
        }
    }
}
