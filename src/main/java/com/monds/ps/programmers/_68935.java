package com.monds.ps.programmers;

public class _68935 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n = n / 3;
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
