package com.monds.ps.programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    static class Solution {
        public int solution(int[] priorities, int location) {
            // 0번째 순서는 없기 때문에 1로 초기화
            int answer = 1;
            // 기본적으로 오름차순이기때문에 reverseOrder 로 내림차순으로 바꿔준다.
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i : priorities) {
                queue.add(i);
            }

            // priorities 를 계속 돌면서 큐의 최상단에 존재하는 값과 비교하여 순서를 증가시킨다.
            while (!queue.isEmpty()) {
                for (int i = 0; i < priorities.length; i++) {
                    if (priorities[i] == queue.peek()) {
                        if (location == i) {
                            // 숫자를 찾았는데 위치(location)까지 동일하다면 바로 값을 돌려준다.
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
