package com.monds.ps.programmers;

public class _68936 {
    private int[][] arr;
    private int[] answer = new int[2];

    private void dfs(int x, int y, int n) {
        if (n == 1 || isSame(x, y, n)) {
            answer[arr[x][y]]++;
            return;
        }

        n /= 2;
        dfs(x, y, n);
        dfs(x + n, y, n);
        dfs(x, y + n, n);
        dfs(x + n, y + n, n);
    }

    private boolean isSame(int x, int y, int n) {
        int check = arr[x][y];
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (check != arr[i][j]) return false;
            }
        }
        return true;
    }

    public int[] solution(int[][] arr) {
        this.arr = arr;
        dfs(0, 0, arr.length);
        return answer;
    }
}
