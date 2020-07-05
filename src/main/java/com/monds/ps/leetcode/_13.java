package com.monds.ps.leetcode;

import java.util.HashMap;

public class _13 {
    static class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> romans = new HashMap<>();
            romans.put('I', 1);
            romans.put('V', 5);
            romans.put('X', 10);
            romans.put('L', 50);
            romans.put('C', 100);
            romans.put('D', 500);
            romans.put('M', 1000);

            int res = 0;
            int prev = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                int curr = romans.get(s.charAt(i));
                res += (prev <= curr) ? curr : -1 * curr;
                prev = curr;
            }
            return res;
        }
    }
}
