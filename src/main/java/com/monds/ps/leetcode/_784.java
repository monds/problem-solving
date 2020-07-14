package com.monds.ps.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suahn on 2020-07-14
 */
public class _784 {
    static class Solution {
        public List<String> letterCasePermutation(String S) {
            List<String> results = new ArrayList<>();
            results.add(S);
            char[] s = S.toCharArray();
            for (int i = 0; i < s.length; i++) {
                if (s[i] >= 'a' && s[i] <= 'z') {
                    char upper = (char) (s[i] - ('a' - 'A'));
                    results.add(S.substring(0, i) + upper + S.substring(i + 1));
                }
            }
            if (results.size() > 2) {
                results.add(S.toUpperCase());
            }
            return results;
        }
    }
}
