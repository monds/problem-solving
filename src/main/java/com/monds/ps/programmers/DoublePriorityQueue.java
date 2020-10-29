package com.monds.ps.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Comparator.reverseOrder());

        int count = 0;
        for (String operation : operations) {
            char op = operation.charAt(0);
            int i = Integer.parseInt(operation.substring(2));
            if (op == 'I') {
                queue1.add(i);
                queue2.add(i);
                count++;
            } else {
                if (i == 1) {
                    if (!queue2.isEmpty()) {
                        int value = queue2.poll();
                        if (queue1.size() == 1 && queue1.peek() == value) {
                            queue1.poll();
                        }
                    }
                } else {
                    if (!queue1.isEmpty()) {
                        int value = queue1.poll();
                        if (queue2.size() == 1 && queue2.peek() == value) {
                            queue2.poll();
                        }
                    }
                }
                count--;
                if (count == 0) {
                    queue1.clear();
                    queue2.clear();
                }
            }
        }

        if (count == 0 || queue1.isEmpty() || queue2.isEmpty()) return new int[] {0, 0};

        return new int[] {
            queue2.poll(),
            queue1.poll()
        };
    }
}
