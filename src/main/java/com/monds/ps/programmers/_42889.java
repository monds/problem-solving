package com.monds.ps.programmers;

import java.util.stream.IntStream;

public class _42889 {
    public int[] solution(int N, int[] stages) {
        double[] answer = new double[N];
        for (int stage : stages) {
            if (stage <= N) {
                answer[stage - 1]++;
            }
        }

        int count = stages.length;
        for (int i = 0; i < N; i++) {
            if (answer[i] != 0) {
                double f = answer[i];
                answer[i] = f / count;
                count -= f;
            }
        }

        return IntStream.range(0, N)
                .boxed()
                .sorted((i, j) -> Double.compare(answer[j], answer[i]))
                .mapToInt(i -> i + 1)
                .toArray();
    }
}
