package com.monds.ps.programmers.sq;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int time = (int) Math.ceil((100 - progresses[i]) * 1.0 / speeds[i]);
            queue.offer(time);

            int count = 0;
            while (!queue.isEmpty() && queue.peek() < time) {
                queue.poll();
                count++;
            }

            if (count > 0) list.add(count);
        }

        list.add(queue.size());

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
