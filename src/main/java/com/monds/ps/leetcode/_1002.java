package com.monds.ps.leetcode;

import java.util.*;

/**
 * Created by suahn on 2020-07-22
 */
public class _1002 {
    static class Solution {
        public List<String> commonChars(String[] A) {
            if (A.length == 0) return Collections.emptyList();
            List<String> res = new ArrayList<>();
            outer:
            for (char c : A[0].toCharArray()) {
                int count = 0;
                for (int i = 1; i < A.length; i++) {
                    String s = A[i];
                    if (s.indexOf(c) == -1) {
                        continue outer;
                    } else {
                        A[i] = s.replaceFirst(c + "", "");
                        count++;
                    }
                }
                if (count == A.length - 1) {
                    res.add(c + "");
                }
            }
            return res;
        }
    }
}
