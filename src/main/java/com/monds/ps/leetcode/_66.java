package com.monds.ps.leetcode;

import java.util.LinkedList;

/**
 * Created by suahn on 2020-07-10
 */
public class _66 {
    static class Solution {
        public int[] plusOne(int[] digits) {
            if (digits[digits.length - 1] != 9) {
                digits[digits.length - 1]++;
                return digits;
            }

            LinkedList<Integer> list = new LinkedList<>();
            int add = 0;
            boolean append = true;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9 && append) {
                    list.addFirst(0);
                    add = 1;
                } else {
                    if (add == 1) append = false;
                    list.addFirst(digits[i] + add);
                    add = 0;
                }
            }
            if (list.get(0) == 0) list.addFirst(1);

            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}
