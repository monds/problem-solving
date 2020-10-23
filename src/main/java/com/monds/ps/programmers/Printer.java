package com.monds.ps.programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    static class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 1;
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i : priorities) {
                queue.add(i);
            }

            while (!queue.isEmpty()) {
                for (int i = 0; i < priorities.length; i++) {
                    if (priorities[i] == queue.peek()) {
                        if (location == i) {
                            return answer;
                        } else {
                            queue.poll();
                            answer++;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
