package com.monds.ps.jfct.impl;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        int[][] moves = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

        int x = input.charAt(0) - 'a' + 1;
        int y = Character.getNumericValue(input.charAt(1));

        int result = 0;
        for (int[] move : moves) {
            int moveX = x + move[0];
            int moveY = y + move[1];
            if (moveX >= 1 && moveX <= 8 && moveY >= 1 && moveY <= 8) result++;
        }

        System.out.print(result);
    }
}
