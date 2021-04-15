package com.monds.ps.programmers;

public class _70129 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder();
        while (!s.equals("1")) {
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    answer[1]++;
                    continue;
                }
                sb.append(c);
            }
            s = Integer.toBinaryString(sb.length());
            answer[0]++;
            sb.setLength(0);
        }
        return answer;
    }
}
