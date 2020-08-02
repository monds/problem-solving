package com.monds.ps.leetcode;

public class _746 {
    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            // 이 문제는 계단을 통과해야 하는 문제로
            // 관점을 cost+1 번째 계단에 가는 최소비용을 구해야 하는 것으로 봐야 한다.
            // cost+1 번째 계단에 가는 최소비용이 곧 이 계단을 사용한 최소비용이기 때문이다.
            // (계단은 1칸 혹은 2칸 씩 이동이 가능하기 때문)
            // 그런식으로 i번째까지 구해주고 i-1, i-2의 비용 중 작은걸 구하면 된다.
            int len = cost.length;
            int[] dp = new int[len];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for (int i = 2; i < len; i++) {
                dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
            }
            return Math.min(dp[len - 1], dp[len - 2]);
        }
    }
}
