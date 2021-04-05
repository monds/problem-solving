package com.monds.ps.programmers.sq;

import java.util.Collections;
import java.util.PriorityQueue;

public class _12927 {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            queue.add(work);
        }
        for (int i = 0; i < n; i++) {
            int temp = queue.poll();
            queue.add(temp - 1);
        }
        long answer = 0;
        while (!queue.isEmpty()) {
            answer += Math.pow(queue.poll(), 2);
        }
        return answer;
    }
}
