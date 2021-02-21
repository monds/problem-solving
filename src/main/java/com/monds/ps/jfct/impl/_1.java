package com.monds.ps.jfct.impl;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String plans = scanner.nextLine();

        int x = 1;
        int y = 1;
        for (String plan : plans.split(" ")) {
            if (plan.equals("R") && x < n) x++;
            if (plan.equals("L") && x > 1) x--;
            if (plan.equals("U") && y > 1) y--;
            if (plan.equals("D") && y < n) y++;
        }

        System.out.printf("%s %s", y, x);
    }
}
