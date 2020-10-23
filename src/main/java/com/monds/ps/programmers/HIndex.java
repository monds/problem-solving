package com.monds.ps.programmers;

public class HIndex {
    static class Solution {
        public int solution(int[] citations) {
            for (int i = citations.length; i >= 0; i--) {
                int count = 0;
                for (int citation : citations) {
                    if (i <= citation) count++;
                }
                if (count >= i) {
                    return i;
                }
            }
            return 0;
        }
    }
}
