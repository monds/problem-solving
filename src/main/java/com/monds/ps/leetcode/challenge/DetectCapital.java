package com.monds.ps.leetcode.challenge;

/**
 * Created by suahn on 2020-08-01
 */
public class DetectCapital {
    static class Solution {
        public boolean detectCapitalUse(String word) {
            boolean firstUpper = Character.isUpperCase(word.charAt(0));
            int start = firstUpper ? 1 : 0;
            Boolean preCase = null;
            for (int i = start; i < word.length(); i++) {
                boolean isUpper = Character.isUpperCase(word.charAt(i));
                if (preCase == null) {
                    preCase = isUpper;
                } else if (isUpper != preCase) {
                    return false;
                }
            }
            return true;
        }
    }
}
