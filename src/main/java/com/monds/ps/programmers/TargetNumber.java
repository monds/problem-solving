package com.monds.ps.programmers;

public class TargetNumber {
    static class Solution {
        int answer = 0;
        public int solution(int[] numbers, int target) {
            dfs(numbers, -numbers[0], 1, target);
            dfs(numbers, numbers[0], 1, target);
            return answer;
        }

        private void dfs(int[] numbers, int prev, int pos, int target) {
            if (pos >= numbers.length) {
                if (prev == target) answer++;
                return;
            }
            dfs(numbers, prev + numbers[pos], pos + 1, target);
            dfs(numbers, prev - numbers[pos], pos + 1, target);
        }
    }
}
