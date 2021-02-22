package com.monds.ps.jfct.impl;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (String.valueOf(i).contains("3")
                        || String.valueOf(j).contains("3")
                        || String.valueOf(k).contains("3")) {
                        result++;
                    }
                }
            }
        }

        System.out.print(result);
    }
}
