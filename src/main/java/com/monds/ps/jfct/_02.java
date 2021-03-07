package com.monds.ps.jfct;

public class _02 {
    public static int solution(String s) {
        int result = Character.getNumericValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int next = Character.getNumericValue(s.charAt(i));
            if (result + next > result * next) result += next;
            else result *= next;
        }
        return result;
    }
}
