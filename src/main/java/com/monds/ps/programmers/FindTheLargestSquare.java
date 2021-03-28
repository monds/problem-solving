package com.monds.ps.programmers;

public class FindTheLargestSquare {
    public int solution(int[][] board) {
        int answer = 0;
        int width = board[0].length;
        int height = board.length;
        int[][] map = new int[height + 1][width + 1];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i + 1][j + 1] = board[i][j];
            }
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (map[i][j] == 0) continue;
                map[i][j] = Math.min(map[i - 1][j - 1], Math.min(map[i][j - 1], map[i - 1][j])) + 1;
                answer = Math.max(answer, map[i][j]);
            }
        }

        return answer * answer;
    }
}
