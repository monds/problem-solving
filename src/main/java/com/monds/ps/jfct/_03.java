package com.monds.ps.jfct;

public class _03 {
    public static int solution(String s) {
        int zero = 0;
        int one = 0;

        if (s.charAt(0) == '0') zero++;
        else one++;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                if (s.charAt(i) == '0') zero++;
                else one++;
            }
        }

        return Math.min(zero, one);
    }
}
