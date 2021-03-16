package com.monds.ps.jfct;

import java.util.Arrays;

public class _08 {
    public static String solution(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                sb.append(c);
            }
        }

        return sb.append(sum).toString();
    }
}
