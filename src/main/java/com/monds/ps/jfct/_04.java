package com.monds.ps.jfct;

import java.util.Arrays;

public class _04 {
    public static int solution(int[] coins) {
        Arrays.sort(coins);

        int target = 1;
        for (int coin : coins) {
            if (target < coin) break;
            target += coin;
        }

        return target;
    }
}
