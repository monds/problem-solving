package com.monds.ps.programmers;

import java.util.Arrays;

public class SteppingStone {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        return search(distance, rocks, n);
    }

    private int search(int distance, int[] rocks, int n){
        long answer = 0;
        long left = 1, right = distance, mid;

        while (left <= right) {
            int cnt = 0;
            int prev = 0;
            mid = (left + right) / 2;

            for (int rock : rocks) {
                if (rock - prev < mid) {
                    cnt++;
                } else {
                    prev = rock;
                }
            }

            if (cnt <= n) {
                answer = Math.max(mid, answer);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) answer;
    }
}
