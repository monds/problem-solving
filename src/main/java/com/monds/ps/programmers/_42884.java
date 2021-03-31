package com.monds.ps.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class _42884 {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));
        int tmp = routes[0][1];
        for (int i = 1; i < routes.length; i++) {
            if (tmp < routes[i][0]) {
                answer++;
                tmp = routes[i][1];
            }
        }
        return answer;
    }
}
