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

        // input이 정렬되지 않고 들어올 수도 있기 때문에 요청 시점 기준으로 정렬을 해줍니다.
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));

        // 작업시간이 빠른 순으로 우선순위큐를 생성합니다.
        PriorityQueue<int[]> queue = new PriorityQueue<>(len, Comparator.comparingInt(o -> o[1]));

        // 없으면 하나 넣고
        while (len > j || !queue.isEmpty()) {
            // time이 현재 job의 요청시간보다 같거나 크다면?
            if (len > j && time >= jobs[j][0]) {
                queue.add(jobs[j++]);
                continue;
            }
            if (!queue.isEmpty()) {
                // 큐에서 꺼낼 job이 있으면 꺼내서
                int[] job = queue.poll();
                // 진입시간에
                time += job[1];
                answer += time - job[0];
            } else {
                // 진입시간이 곧 시간이다. 증분도 필요없다.
                time = jobs[j][0];
            }
        }

        return answer / len;
    }
}
