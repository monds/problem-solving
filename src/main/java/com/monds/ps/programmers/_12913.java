package com.monds.ps.programmers;

/**
 * 땅따먹기
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/12913">문제링크</a>
 */
public class _12913 {
    int solution(int[][] land) {
        int answer = 0;
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                land[i][j] += land[i - 1][findMaxIndex(land, i - 1, j)];
                answer = Math.max(answer, land[i][j]);
            }
        }
        return answer;
    }

    int findMaxIndex(int[][] land, int idx, int ignoreIdx) {
        int max = 0;
        int maxIdx = -1;
        for (int i = 0; i < 4; i++) {
            if (i == ignoreIdx) continue;
            if (max < land[idx][i]) {
                max = land[idx][i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
