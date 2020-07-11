package com.monds.ps.leetcode;

import java.util.Arrays;

public class _389 {
    static class Solution {
        public char findTheDifference(String s, String t) {
            String[] arr1 = s.split("");
            Arrays.sort(arr1);

            String[] arr2 = t.split("");
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) return arr2[i].charAt(0);
            }
            return arr2[arr2.length - 1].charAt(0);
        }
    }
}
