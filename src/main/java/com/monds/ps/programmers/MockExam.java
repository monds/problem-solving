package com.monds.ps.programmers;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    static class Solution {
        public int[] solution(int[] answers) {
            int[] answer1 = {1,2,3,4,5};
            int[] answer2 = {2,1,2,3,2,4,2,5};
            int[] answer3 = {3,3,1,1,2,2,4,4,5,5};

            int[] answer = new int[3];
            int max = 0;

            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == answer1[i % answer1.length]) answer[0]++;
                if (answers[i] == answer2[i % answer2.length]) answer[1]++;
                if (answers[i] == answer3[i % answer3.length]) answer[2]++;
            }

            for (int j : answer) {
                if (j > max) max = j;
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < answer.length; i++) {
                if (answer[i] == max) list.add(i);
            }

            return list.stream()
                .mapToInt(value -> value + 1)
                .toArray();
        }
    }
}
