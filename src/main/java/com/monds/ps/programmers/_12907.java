package com.monds.ps.programmers;

import java.util.Arrays;

public class _12907 {
    private int[] money;
    private int count;
    private int chk;
    private int limit;

    private void find(int pos, int curr, String s) {
        chk++;
        if (curr == 0) {
            System.out.println(s);
            count++;
            return;
        } else if (curr < 0 || pos > limit) {
            System.out.println(s);
            return;
        }

        for (int i = 0; i <= curr / money[pos]; i++) {
            find(pos + 1, curr - (money[pos] * i), s + "(" + money[pos] + "*" + i + ")");
        }
    }

    public int solution(int n, int[] money) {
        this.money = money;
        Arrays.sort(money);
        for (int i = 0; i < money.length; i++) {
            if (money[i] > n) {
                break;
            }
            if (money[i] == n) {
                count++;
                limit = i - 1;
                break;
            }
            limit = i;
        }

        find(0, n, "");
        System.out.println("count: " + count);
        System.out.println("chk: " + chk);
        return count % 1_000_000_007;
    }
}
