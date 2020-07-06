package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-06
 */
public class _14 {
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            char[] tempArr = new char[strs[0].length()];
            int pos = 0;
            outer:
            for (int i = 0; i < strs[0].length(); i++) {
                char check = strs[0].charAt(pos);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length() <= pos || check != strs[j].charAt(pos)) break outer;
                }
                tempArr[pos] = check;
                pos++;
            }
            return new String(tempArr).trim();
        }
    }
}
