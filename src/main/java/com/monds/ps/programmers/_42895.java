package com.monds.ps.programmers;

/**
 * N으로 표현
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42895">문제링크</a>
 */
public class _42895 {
    private int n;
    private int target;
    private int answer = Integer.MAX_VALUE;

    public int solution(int N, int number) {
        n = N;
        target = number;
        dfs(0, 0);
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public void dfs(int count, int prev) {
        if (count > 8) {
            answer = -1;
            return;
        }

        if (prev == target) {
            answer = Math.min(answer, count);
            return;
        }

        int temp = n;
        for (int i = 0; i < 8 - count; i++) {
            int newCount = count + i + 1;
            dfs(newCount, prev + temp);
            dfs(newCount, prev - temp);
            dfs(newCount, prev * temp);
            dfs(newCount, prev / temp);

            temp = temp * 10 + n;
        }
    }
}
