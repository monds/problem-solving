package com.monds.ps.leetcode;

public class _788 {
    static class Solution {
        public int rotatedDigits(int N) {
            final int[] digits = {2,2,1,0,0,1,1,0,2,1};
            int count = 0;
            outer:
            for (int i = 1; i <= N; i++) {
                boolean check = false;
                for (char c : String.valueOf(i).toCharArray()) {
                    int digit = digits[Character.getNumericValue(c)];
                    if (digit == 0) continue outer;
                    if (digit == 1) check = true;
                }
                if (check) count++;
            }
            return count;
        }
    }
}
