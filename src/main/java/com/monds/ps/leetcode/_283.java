package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-14
 */
public class _283 {
    static class Solution {
        private static void swap(int[] arr, int index1, int index2) {
            int temp = arr[index2];
            arr[index2] = arr[index1];
            arr[index1] = temp;
        }
        public void moveZeroes(int[] nums) {
            for (int lastNonZeroFoundPos = 0, i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    swap(nums, lastNonZeroFoundPos, i);
                    lastNonZeroFoundPos++;
                }
            }
        }
    }
}
