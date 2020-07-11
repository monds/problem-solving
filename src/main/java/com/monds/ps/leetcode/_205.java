package com.monds.ps.leetcode;

import java.util.Arrays;

public class _205 {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            return Arrays.equals(toArray(s), toArray(t));
        }
        private int[] toArray(String s) {
            if (s.length() == 0) return new int[0];
            int id = 0;
            int[] ids = new int[s.length()];
            ids[0] = id++;
            for (int i = 1; i < s.length(); i++) {
                int check = s.indexOf(s.charAt(i));
                ids[i] = check == i ? id++ : ids[check];
            }
            return ids;
        }
    }
}
