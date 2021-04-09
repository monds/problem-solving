package com.monds.ps.programmers;

public class _68645 {
    private int[][] dx = {{1, 0}, {0, 1}, {-1, -1}};
    private int[][] arr;
    private int n;
    private int max;

    public int[] solution(int n) {
        arr = new int[n + 1][n + 1];
        this.n = n;
        for (int i = 1; i <= n; i++) {
            max += i;
        }

        move(1, 0, 0, 1, n);

        int[] answer = new int[max];
        int seq = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] != 0) {
                    answer[seq++] = arr[i][j];
                }
            }
        }

        return answer;
    }

    private void move(int seq, int idx, int x, int y, int n) {
        if (seq > max) return;

        for (int i = 0; i < n; i++) {
            x += dx[idx][0];
            y += dx[idx][1];
            arr[x][y] = seq++;
        }
        idx = idx == 2 ? 0 : idx + 1;
        move(seq, idx, x, y, n - 1);
    }
}
