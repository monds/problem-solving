package com.monds.ps.programmers.dp;

public class _42898 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n + 1][m + 1];
        for (int[] puddle : puddles) {
            if (puddle.length > 0) {
                map[puddle[1]][puddle[0]] = -1;
            }
        }
        map[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == -1) continue;
                if (map[i - 1][j] == -1) map[i][j] = map[i][j - 1];
                else if (map[i][j - 1] == -1) map[i][j] = map[i - 1][j];
                else if (map[i][j] == 0) map[i][j] = map[i - 1][j] + map[i][j - 1];
                map[i][j] %= 1_000_000_007;
            }
        }
        return map[n][m];
    }
}
