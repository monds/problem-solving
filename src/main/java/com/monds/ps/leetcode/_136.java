package com.monds.ps.leetcode;

import java.util.HashMap;

/**
 * Created by suahn on 2020-07-06
 */
public class _136 {
    static class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (Integer k : map.keySet()) {
                if (map.get(k) == 1) return k;
            }
            return 0;
        }
    }
}
