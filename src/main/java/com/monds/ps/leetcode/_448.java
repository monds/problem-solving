package com.monds.ps.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _448 {
    static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= nums.length; i++) {
                set.add(i);
            }

            for (int num : nums) {
                set.remove(num);
            }
            return new ArrayList<>(set);
        }
    }
}
