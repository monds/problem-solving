package com.monds.ps.leetcode;

import java.util.HashMap;

public class _169 {
    static class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > nums.length / 2.0) {
                    return num;
                }
            }
            return 0;
        }
    }
}
