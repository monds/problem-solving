package com.monds.ps.programmers;

public class Carpet {
    static class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];

            int n = brown + yellow;

            for (int i = 3; i <= n; i++) {
                if (n % i > 0) continue;
                int j = n / i;
                if (i < j || j < 3) continue;
                int size = (i*2) + (j-2)*2;
                if (brown == size) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }

            return answer;
        }
    }
}
