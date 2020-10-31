package com.monds.ps.programmers;

public class CreateLargeNumber {
    public String solution(String number, int k) {
        int len = number.length() - k - 1;
        int start = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < number.length() - k) {
            start = largestAt(number, start, len--);
            sb.append(number.charAt(start));
            start += 1;
        }

        return sb.toString();
    }

    private int largestAt(String number, int start, int k) {
        int pos = start;
        int len = number.length();
        for (int i = 9; i >= 0; i--) {
            pos = number.indexOf(Character.forDigit(i, 10), start);
            if (pos != -1 && pos < len - k) {
                break;
            }
        }
        return pos;
    }
}
