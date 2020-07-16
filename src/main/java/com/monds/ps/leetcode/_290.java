package com.monds.ps.leetcode;

import java.util.HashMap;

/**
 * Created by suahn on 2020-07-16
 */
public class _290 {
    static class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] arr = str.split(" ");
            HashMap<Character, String> map = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String s = arr[i];
                String check = map.get(c);
                if (check == null) {
                    map.put(c, s);
                } else if (!s.equals(check)) {
                    return false;
                }
            }
            return true;
        }
    }
}
