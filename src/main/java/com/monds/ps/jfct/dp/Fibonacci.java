package com.monds.ps.jfct.dp;

import java.math.BigDecimal;

public class Fibonacci {
    public static void main(String[] args) {

        BigDecimal[] dp = new BigDecimal[100];

        dp[0] = new BigDecimal(1);
        dp[1] = new BigDecimal(1);

        for (int i = 2; i < 100; i++) {
            dp[i] = new BigDecimal(dp[i - 1].add(dp[i - 2]).toString());
        }

        System.out.println(dp[99]);
    }
}
