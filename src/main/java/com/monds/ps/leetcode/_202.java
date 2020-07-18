package com.monds.ps.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by suahn on 2020-07-17
 */
public class _202 {
    static class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
            while (n != 1) {
                n = repeat(n);
                if (set.contains(n)) return false;
                set.add(n);
            }
            return true;
        }

        private int repeat(int n) {
            String s = String.valueOf(n);
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += Math.pow(c - '0', 2);
            }
            return sum;
        }
    }
}
