package com.monds.ps.leetcode;

import java.util.HashMap;

/**
 * Created by suahn on 2020-07-16
 */
public class _290 {
    static class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] words = str.split(" ");
            if (pattern.length() != words.length) return false;

            HashMap<Object, Integer> map = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String w = words[i];

                map.putIfAbsent(c, i);
                map.putIfAbsent(w, i);

                if (map.get(c).intValue() != map.get(w).intValue()) {
                    return false;
                }
            }
            return true;
        }
    }
}
