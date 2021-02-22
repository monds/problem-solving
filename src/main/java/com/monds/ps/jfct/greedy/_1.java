package com.monds.ps.jfct.greedy;

public class _1 {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;

        int[] coinTypes = {500, 100, 50, 10};

        for (int coinType : coinTypes) {
            count += n / coinType;
            n %= coinType;
        }

        System.out.print(count);
    }
}
