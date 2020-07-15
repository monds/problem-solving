package com.monds.ps.leetcode;

import java.util.Arrays;

public class _581 {
    static class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int[] clones = nums.clone();
            Arrays.sort(clones);
            int start = clones.length;
            int end = 0;
            for (int i = 0; i < clones.length; i++) {
                if (nums[i] != clones[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start > 0) ? end - start + 1 : 0;
        }
    }
}
