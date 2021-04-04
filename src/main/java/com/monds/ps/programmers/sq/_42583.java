package com.monds.ps.programmers.sq;

import java.util.LinkedList;
import java.util.Queue;

public class _42583 {
    // 2가지가 중요하다.
    // 1. 결과 시간 = 마지막 트럭이 다리 위에 올라갈때까지 걸린 시간 + 다리 길이
    // (마지막 트럭이 나갈때까지 걸리는 시간은 다리 길이이기 때문)
    // 2. 트럭 이동은 0을 큐에 넣어준다.
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();

        int total = 0;
        int time = 0;

        for (int w : truck_weights) {
            while (true) {
                // 다리 위에 올라간 트럭이 없으면 올라간다.
                // 마지막 트럭이면 올라간 후 바로 loop에서 나간다 (break)
                if (queue.isEmpty()) {
                    queue.add(w);
                    time++;
                    total += w;
                    break;
                } else if (queue.size() == bridge_length) {
                    // 큐 사이즈와 다리길이가 같다는 것은 특정 트럭이 다리 끝에 있다는 말이다.
                    total -= queue.poll();
                } else {
                    if (w + total > weight) {
                        time++;
                        // 다리에 올라간 트럭을 이동시키기 위해 0을 올린다.
                        queue.add(0);
                    } else {
                        queue.add(w);
                        total += w;
                        time++;
                        break;
                    }
                }
            }
        }

        return time + bridge_length;
    }
}
