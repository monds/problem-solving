package com.monds.ps.programmers;

import java.util.PriorityQueue;

public class Spicier {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int min = 0;

        for (int s : scoville) {
            queue.add(s);
            if (s >= K) {
                min = min == 0 ? s : Math.min(min, s);
            }
        }

        if (min == 0) min = K;

        while (!queue.isEmpty() && queue.size() > 1) {
            int first = queue.poll();
            if (first >= min) return answer;

            if (!queue.isEmpty()) {
                int second = queue.poll();
                queue.add(first + (second * 2));
                answer++;
            }
        }

        if (queue.size() == 1 && queue.poll() < K) {
            return -1;
        }

        return answer;
    }
}
