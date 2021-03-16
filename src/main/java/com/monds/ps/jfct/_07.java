package com.monds.ps.jfct;

public class _07 {
    public static String solution(int n) {
        int left = 0;
        int right = 0;
        char[] chars = String.valueOf(n).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            left += Character.getNumericValue(chars[i]);
        }
        for (int i = chars.length / 2; i < chars.length; i++) {
            right += Character.getNumericValue(chars[i]);
        }
        return left == right ? "LUCKY" : "READY";
    }
}
