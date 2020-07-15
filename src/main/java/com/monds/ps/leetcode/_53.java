package com.monds.ps.leetcode;

/**
 * Kanade's Algorithm
 */
public class _53 {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int[] memo = new int[nums.length];
            memo[0] = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                memo[i] = Math.max(nums[i], nums[i] + memo[i - 1]);
                max = Math.max(max, memo[i]);
            }
            return max;
        }
    }
}
