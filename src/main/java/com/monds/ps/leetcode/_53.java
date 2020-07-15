package com.monds.ps.leetcode;

/**
 * Kanade's Algorithm
 */
public class _53 {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int pre = nums[0];
            int max = pre;
            for (int i = 1; i < nums.length; i++) {
                pre = Math.max(nums[i], nums[i] + pre);
                max = Math.max(max, pre);
            }
            return max;
        }
    }
}
