package com.monds.ps.jfct.dp;

import java.util.Arrays;
import java.util.Scanner;

public class MonetaryComposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 화폐 개수
        int m = scanner.nextInt(); // 금액

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 주어진 금액에 대해 memo 하기 위해 m으로 초기화
        int[] dp = new int[m + 1];
        // 10000은 1에 대해 개수에 포함될 수도 있기 때문에 10001로 설정
        Arrays.fill(dp, 10001);
        // dp 값을 가지고 1씩 증가시켜주기 위해 초기값은 0이 있어야 화폐 사용가능할때 1씩 증가가 가능하다.
        dp[0] = 0;

        // 화폐 개수만큼 loop
        for (int i = 0; i < n; i++) {
            // 나눠지는 값을 구하려면 화폐 금액을 시작으로 주어진 금액까지 loop 한다.
            for (int j = arr[i]; j < m + 1; j++) {
                // [다른 화폐 경우의 수]와 [현재 금액(j) - 화폐값 + 1 하면 이전 값에 비해 1씩 증가] 값을 비교할 수 있다.
                dp[j] = Math.min(dp[j - arr[i]] + 1, dp[j]);
            }
        }

        System.out.println(dp[m] == 10001 ? -1 : dp[m]);
    }
}
