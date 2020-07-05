package com.monds.ps.leetcode;

public class _13 {
    static class Solution {
        public int romanToInt(String s) {
            int res = 0;
            for (char c : s.toCharArray()) {
                switch (c) {
                    case 'I': res += 1;
                    case 'V': res += 3;
                }
            }
            return res;
        }
    }
}
