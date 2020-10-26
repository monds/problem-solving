package com.monds.ps.programmers;

import java.util.Arrays;

/**
 * Created by monds on 2020-10-25
 */
public class Immigration {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = Long.MAX_VALUE;
        long left = 0;
        long right = times[times.length - 1];
        long mid;

        right *= n;

        while (left <= right) {
            mid = (left + right) / 2;
            long done = 0;

            for (int time : times) {
                done += mid / time;
            }

            if (done < n) {
                left = mid + 1;
            } else {
                if (mid < answer) {
                    answer = mid;
                }
                right = mid - 1;
            }
        }

        return answer;
    }
}
