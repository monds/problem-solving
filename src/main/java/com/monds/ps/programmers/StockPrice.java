package com.monds.ps.programmers;

public class StockPrice {
    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                int curr = prices[i];
                for (int j = i + 1; j < prices.length; j++) {
                    if (curr <= prices[j]) {
                        answer[i]++;
                    } else {
                        answer[i]++;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
