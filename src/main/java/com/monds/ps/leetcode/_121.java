package com.monds.ps.leetcode;

/**
 * Created by suahn on 2020-07-05
 */
public class _121 {
    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0) return 0;
            int buy = prices[0];
            int profit = 0;
            for (int i = 0; i < prices.length; i++) {
                int curr = prices[i];
                if (buy > curr) buy = curr;
                else if (curr - buy > profit) profit = curr - buy;
            }
            return profit;
        }
    }
}
