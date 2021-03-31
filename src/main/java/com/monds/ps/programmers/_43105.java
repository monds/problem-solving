package com.monds.ps.programmers;

public class _43105 {
    public int solution(int[][] triangle) {
        if (triangle.length == 1) return triangle[0][0];
        if (triangle.length == 2) return Math.max(triangle[1][0], triangle[1][1]) + triangle[0][0];

        triangle[1][0] += triangle[0][0];
        triangle[1][1] += triangle[0][0];

        int max = 0;
        for (int i = 2; i < triangle.length; i++) {
            int len = triangle[i].length;
            for (int j = 0; j < len; j++) {
                if (j == 0) triangle[i][j] += triangle[i - 1][j];
                else if (j + 1 == len) triangle[i][j] += triangle[i - 1][j - 1];
                else triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);

                max = Math.max(max, triangle[i][j]);
            }
        }

        return max;
    }
}
