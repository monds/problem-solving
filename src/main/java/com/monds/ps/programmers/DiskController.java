package com.monds.ps.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int len = jobs.length;
        if (len == 1) return jobs[0][1] - jobs[0][0];
        int answer = 0;
        int time = 0;
        int j = 0;

        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));

        PriorityQueue<int[]> queue = new PriorityQueue<>(len, Comparator.comparingInt(o -> o[1]));

        // 없으면 하나 넣고
        while (len > j || !queue.isEmpty()) {
            if (len > j && time >= jobs[j][0]) {
                queue.add(jobs[j++]);
                continue;
            }
            if (!queue.isEmpty()) {
                int[] job = queue.poll();
                time += job[1];
                answer += time - job[0];
            } else {
                time = jobs[j][0];
            }
        }

        return answer / len;
    }
}
