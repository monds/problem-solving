package com.monds.ps.jfct.dp;

import java.util.Scanner;

public class MakeOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int[] dp = new int[x + 1];

        for (int i = 2; i <= x; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            else if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            else if (i % 5 == 0) dp[i] = Math.min(dp[i], dp[i / 5] + 1);
        }

        System.out.println(dp[x]);
    }
}
