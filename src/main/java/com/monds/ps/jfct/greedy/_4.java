package com.monds.ps.jfct.greedy;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;

        while (n > 1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n--;
            }
            count++;
        }

        System.out.print(count);
    }
}
