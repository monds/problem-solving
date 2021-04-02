package com.monds.ps.programmers;

public class _12899 {
    public String solution(int n) {
        char[] chars = {'4', '1', '2'};
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int mod = n % 3;
            sb.insert(0, chars[mod]);
            n /= 3;
            if (mod == 0) n -= 1;
        }
        return sb.toString();
    }
}
